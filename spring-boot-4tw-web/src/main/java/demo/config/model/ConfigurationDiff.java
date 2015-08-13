package demo.config.model;

import java.util.LinkedList;
import java.util.List;

public class ConfigurationDiff {

	private String fromVersion;

	private String toVersion;

	private final List<ConfigurationGroupDiff> groups = new LinkedList<>();

	public String getFromVersion() {
		return fromVersion;
	}

	public void setFromVersion(String fromVersion) {
		this.fromVersion = fromVersion;
	}

	public String getToVersion() {
		return toVersion;
	}

	public void setToVersion(String toVersion) {
		this.toVersion = toVersion;
	}

	public List<ConfigurationGroupDiff> getGroups() {
		return groups;
	}

}
