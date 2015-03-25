package io.gazelle.tools.pojobuilder;

import io.gazelle.jerseytest.ajaxapi.resources.AjaxResource;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.lang.StringUtils;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;

public class PojoBuilder {

	private static JCodeModel codeModel = new JCodeModel();

	private static RuleFactory rf = new RuleFactory(new GazelleGenerationConfig(), new GazelleJacksonAnnotator(),
			new SchemaStore());
	private static SchemaMapper scm = new SchemaMapper(rf, new SchemaGenerator());

	public static void main(String[] args) throws IOException, JClassAlreadyExistsException, URISyntaxException {
		URL json = AjaxResource.class.getResource("");

		File rfolder = new File(json.toURI());
		SuffixFileFilter b = new SuffixFileFilter(".json");
		File[] resourcesSamples = rfolder.listFiles((FileFilter) b);

		Arrays.stream(resourcesSamples).forEach(s -> generatePojoOf(s));

	}

	private static void generatePojoOf(File sampleJson) {
		String fileName = FilenameUtils.removeExtension(sampleJson.getName());
		String className = StringUtils.capitalize(fileName);
		String packagePath = AjaxResource.class.getPackage().getName() + "." + fileName;
		try {
			scm.generate(codeModel, className, packagePath, sampleJson.toURI().toURL());
			File output = new File("target/generated-classes");
			output.mkdirs();
			FileUtils.cleanDirectory(output);
			output.mkdirs();
			codeModel.build(output);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
