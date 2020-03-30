/**
 * 
 */
package com.tdevilleduc.urthehero.reactive.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * @author xpax624
 *
 */
@Validated
@ConfigurationProperties(prefix = "swagger")
public class SwaggerApiInfoProperties {

	@Valid
	private Map<String, ApiInfoProperties> groups;
	
	@Valid
	private ApiInfoProperties defaultApiInfo;
	
	/**
	 * @return the apis
	 */
	public Map<String, ApiInfoProperties> getGroups() {
		return groups;
	}

	/**
	 * @param groups the apis to set
	 */
	public void setGroups(Map<String, ApiInfoProperties> groups) {
		this.groups = groups;
	}

	/**
	 * @return the defaultApiInfo
	 */
	public ApiInfoProperties getDefaultApiInfo() {
		return defaultApiInfo;
	}

	/**
	 * @param defaultApiInfo the defaultApiInfo to set
	 */
	public void setDefaultApiInfo(ApiInfoProperties defaultApiInfo) {
		this.defaultApiInfo = defaultApiInfo;
	}

	/**
	 * 
	 * @param groupName
	 * @return
	 */
	public ApiInfoProperties getGroupApiInfo(String groupName) {
		return this.groups.get(groupName);
	}
	
	public static class ApiInfoProperties {

		/**
		 * Title api
		 */
		private String title;
		/**
		 * Description api
		 */
		private String description;
		/**
		 * Terms of service url
		 */
		private String termsOfServiceUrl;
		/**
		 * Licence name
		 */
		private String license;
		/**
		 * Licence url
		 */
		private String licenseUrl;
		/**
		 * Version
		 */
		private String version;
		/**
		 * Contact
		 */
		@Valid
		private Contact contact;

		/**
		 * @return the title
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * @param title
		 *            the title to set
		 */
		public void setTitle(String title) {
			this.title = title;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description
		 *            the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * @return the termsOfServiceUrl
		 */
		public String getTermsOfServiceUrl() {
			return termsOfServiceUrl;
		}

		/**
		 * @param termsOfServiceUrl
		 *            the termsOfServiceUrl to set
		 */
		public void setTermsOfServiceUrl(String termsOfServiceUrl) {
			this.termsOfServiceUrl = termsOfServiceUrl;
		}

		/**
		 * @return the license
		 */
		public String getLicense() {
			return license;
		}

		/**
		 * @param license
		 *            the license to set
		 */
		public void setLicense(String license) {
			this.license = license;
		}

		/**
		 * @return the licenceUrl
		 */
		public String getLicenseUrl() {
			return licenseUrl;
		}

		/**
		 * @param licenseUrl
		 *            the licenceUrl to set
		 */
		public void setLicenseUrl(String licenseUrl) {
			this.licenseUrl = licenseUrl;
		}

		/**
		 * @return the version
		 */
		public String getVersion() {
			return version;
		}

		/**
		 * @param version
		 *            the version to set
		 */
		public void setVersion(String version) {
			this.version = version;
		}

		/**
		 * @return the contact
		 */
		public Contact getContact() {
			return contact;
		}

		/**
		 * @param contact
		 *            the contact to set
		 */
		public void setContact(Contact contact) {
			this.contact = contact;
		}
		
		/**
		 * Contact model
		 * 
		 * @author xpax624
		 *
		 */
		public static class Contact {
			/**
			 * Contact name
			 */
			@NotNull
			private String name;
			/**
			 * Url
			 */
			private String url;
			/**
			 * Email
			 */
			private String email;
		
			/**
			 * @return the name
			 */
			public String getName() {
				return name;
			}
		
			/**
			 * @param name
			 *            the name to set
			 */
			public void setName(String name) {
				this.name = name;
			}
		
			/**
			 * @return the url
			 */
			public String getUrl() {
				return url;
			}
		
			/**
			 * @param url
			 *            the url to set
			 */
			public void setUrl(String url) {
				this.url = url;
			}
		
			/**
			 * @return the email
			 */
			public String getEmail() {
				return email;
			}
		
			/**
			 * @param email
			 *            the email to set
			 */
			public void setEmail(String email) {
				this.email = email;
			}
		
		}
	}
}
