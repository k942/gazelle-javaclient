package io.gazelle.tools.pojobuilder;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.Iterator;

import org.jsonschema2pojo.AllFileFilter;
import org.jsonschema2pojo.AnnotationStyle;
import org.jsonschema2pojo.Annotator;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.NoopAnnotator;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

public class GazelleGenerationConfig implements GenerationConfig {

	/**
	 * @return <code>false</code>
	 */
	@Override
	public boolean isGenerateBuilders() {
		return false;
	}

	/**
	 * @return <code>false</code>
	 */
	@Override
	public boolean isUsePrimitives() {
		return false;
	}

	/**
	 * Unsupported since no default source is possible.
	 */
	@Override
	public Iterator<URL> getSource() {
		throw new UnsupportedOperationException("No default source available");
	}

	/**
	 * @return the current working directory
	 */
	@Override
	public File getTargetDirectory() {
		return new File(".");
	}

	/**
	 * @return the 'default' package (i.e. an empty string)
	 */
	@Override
	public String getTargetPackage() {
		return "";
	}

	/**
	 * @return an empty array (i.e. no word delimiters)
	 */
	@Override
	public char[] getPropertyWordDelimiters() {
		return new char[] { '-', ' ', '_' };
	}

	/**
	 * @return <code>false</code>
	 */
	@Override
	public boolean isUseLongIntegers() {
		return true;
	}

	@Override
	public boolean isUseDoubleNumbers() {
		return true;
	}

	/**
	 * @return <code>true</code>
	 */
	@Override
	public boolean isIncludeHashcodeAndEquals() {
		return true;
	}

	/**
	 * @return <code>true</code>
	 */
	@Override
	public boolean isIncludeToString() {
		return true;
	}

	/**
	 * @return {@link AnnotationStyle#JACKSON2}
	 */
	@Override
	public AnnotationStyle getAnnotationStyle() {
		return AnnotationStyle.JACKSON;
	}

	/**
	 * {@link NoopAnnotator}
	 */
	@Override
	public Class<? extends Annotator> getCustomAnnotator() {
		return NoopAnnotator.class;
	}

	@Override
	public Class<? extends RuleFactory> getCustomRuleFactory() {
		return RuleFactory.class;
	}

	/**
	 * @return <code>false</code>
	 */
	@Override
	public boolean isIncludeJsr303Annotations() {
		return false;
	}

	/**
	 * @return {@link SourceType#JSONSCHEMA}
	 */
	@Override
	public SourceType getSourceType() {
		return SourceType.JSON;
	}

	/**
	 * @return UTF-8
	 */
	@Override
	public String getOutputEncoding() {
		return "UTF-8";
	}

	/**
	 * @return false
	 */
	@Override
	public boolean isRemoveOldOutput() {
		return true;
	}

	/**
	 * @return false
	 */
	@Override
	public boolean isUseJodaDates() {
		return false;
	}

	/**
	 * @return false
	 */
	@Override
	public boolean isUseJodaLocalDates() {
		return false;
	}

	/**
	 * @return false
	 */
	@Override
	public boolean isUseJodaLocalTimes() {
		return false;
	}

	@Override
	public boolean isUseCommonsLang3() {
		return true;
	}

	@Override
	public FileFilter getFileFilter() {
		return new AllFileFilter();
	}

	/**
	 * @return <code>true</code>
	 */
	@Override
	public boolean isInitializeCollections() {
		return true;
	}

	@Override
	public String getClassNamePrefix() {
		return "";
	}

	@Override
	public String getClassNameSuffix() {
		return "";
	}

	@Override
	public boolean isIncludeConstructors() {
		return false;
	}

	/**
	 * Gets the 'constructorsRequiredPropertiesOnly' configuration option
	 *
	 * @return Whether generated constructors should have parameters for all
	 *         properties, or only required ones.
	 */
	@Override
	public boolean isConstructorsRequiredPropertiesOnly() {
		return false;
	}

}
