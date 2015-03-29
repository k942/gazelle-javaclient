package io.gazelle.resources;

import java.util.Optional;

import javax.ws.rs.client.WebTarget;

public class MessagesResourceArgs {

	int page = 1;
	BoxType type = BoxType.INBOX;
	Optional<SortType> sort = Optional.empty();
	Optional<String> search = Optional.empty();
	Optional<SearchType> searchType = Optional.empty();

	/**
	 * @param page
	 *            the page to set
	 * @return
	 */
	public MessagesResourceArgs setPage(int page) {
		this.page = page;
		return this;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public MessagesResourceArgs setType(BoxType type) {
		this.type = type;
		return this;
	}

	/**
	 * @param sort
	 *            the sort to set
	 */
	public MessagesResourceArgs setSort(SortType sort) {
		this.sort = Optional.of(sort);
		return this;
	}

	/**
	 * @param search
	 *            the search to set
	 */
	public MessagesResourceArgs setSearch(String search) {
		if (!this.searchType.isPresent()) {
			this.searchType = Optional.of(SearchType.USER);
		}
		this.search = Optional.of(search);
		return this;
	}

	/**
	 * @param searchType
	 *            the searchType to set
	 */
	public MessagesResourceArgs setSearchType(SearchType searchType) {
		this.searchType = Optional.of(searchType);
		return this;
	}

	public WebTarget apply(WebTarget target) {
		target = target.queryParam("page", this.page).queryParam("type", this.type);
		if (sort.isPresent())
			target = target.queryParam("sort", this.sort);
		if (search.isPresent())
			target = target.queryParam("search", this.search);
		if (searchType.isPresent())
			target = target.queryParam("searchtype", this.searchType);
		return target;
	}

	public enum BoxType {
		INBOX("inbox"), SENTBOX("sentbox");

		private String value;

		BoxType(String value) {
			this.value = value;
		}

		public String toString() {
			return value;
		}
	}

	public enum SortType {
		UNREAD_FIRST("unread"), LATEST_FIRST("");

		private String value;

		SortType(String value) {
			this.value = value;
		}

		public String toString() {
			return value;
		}
	}

	public enum SearchType {
		SUBJECT("subject"), MESSAGE("message"), USER("user");

		private String value;

		SearchType(String value) {
			this.value = value;
		}

		public String toString() {
			return value;
		}
	}

}
