package com.danielpacak.jenkins.ci.core.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.danielpacak.jenkins.ci.core.Plugin;
import com.danielpacak.jenkins.ci.core.client.JenkinsClient;
import com.danielpacak.jenkins.ci.core.client.JenkinsResponse;

/**
 * Plugin service class.
 * 
 * @see <a href="https://wiki.jenkins-ci.org/display/JENKINS/Plugins">Jenkins Plugins</a>
 * @since 1.0.0
 */
public class PluginService extends AbstractService {

	/**
	 * Create plugin service for the default client.
	 */
	public PluginService() {
		super();
	}

	/**
	 * Create plugin service for the given client.
	 * 
	 * @param client
	 */
	public PluginService(JenkinsClient client) {
		super(client);
	}

	/**
	 * Get all plugins hosted on Jenkins.
	 * 
	 * @return list of plugins
	 * @throws IOException
	 */
	public List<Plugin> getPlugins() throws IOException {
		JenkinsResponse response = client.get("/pluginManager/api/xml?depth=1");
		return toListOfPlugins(response);
	}
	
	private List<Plugin> toListOfPlugins(JenkinsResponse response) {
		// put this hacy xpath stuff for the moment
		return new ArrayList<Plugin>();
	}

}