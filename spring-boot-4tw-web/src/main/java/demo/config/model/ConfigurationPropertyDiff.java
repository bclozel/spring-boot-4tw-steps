package demo.config.model;

import demo.config.diff.ConfigDiffType;

public class ConfigurationPropertyDiff {

	private String id;

	private ConfigDiffType diffType;

	private ConfigurationMetadata from;

	private ConfigurationMetadata to;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConfigDiffType getDiffType() {
		return diffType;
	}

	public void setDiffType(ConfigDiffType diffType) {
		this.diffType = diffType;
	}

	public ConfigurationMetadata getFrom() {
		return from;
	}

	public void setFrom(ConfigurationMetadata from) {
		this.from = from;
	}

	public ConfigurationMetadata getTo() {
		return to;
	}

	public void setTo(ConfigurationMetadata to) {
		this.to = to;
	}

}
