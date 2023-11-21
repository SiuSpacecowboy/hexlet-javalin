package gg.jte.generated.ondemand.lesson15;
import exercise.lesson15.UsersPage;
import main_project.util.NameRoutes;
public final class JteuserslistGenerated {
	public static final String JTE_NAME = "lesson15/users-list.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,8,8,13,13,13,13,14,14,17,17,18,18,20,20,20,20,20,20,20,20,21,21,23,23,24,24,24,24,24,24,24,24,25,25,26,26,27,27,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,31,31,32,32,33,33,33,33,33,33,33,33,34,34,35,35,36,36,36,36,36,36,36,36,37,37,38,41,41,42,42,42,42,46,46,46,46,46,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage users) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.main_project.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <header>\r\n        <h1><a href=\"/\">Home page</a></h1>\r\n        <h2><p>All users:</p></h2>\r\n    </header>\r\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    ");
				if (users.getPage() <= 0) {
					jteOutput.writeContent("\r\n        <h4><p>Page can't be less than 1</p></h4>\r\n        <h5><p>Showing 1st page:</p></h5>\r\n    ");
				}
				jteOutput.writeContent("\r\n    ");
				if (users.getUsers().isEmpty() && users.isHaveUsers()) {
					jteOutput.writeContent("\r\n        <p>Database doesn't have so many users</p>\r\n        <h3><a href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(NameRoutes.allUsersPath());
					jteOutput.setContext("a", null);
					jteOutput.writeContent("?page=");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(String.valueOf(users.getPage() - 1));
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\">One Page back</a></h3>\r\n    ");
				} else if (users.getUsers().isEmpty()) {
					jteOutput.writeContent("\r\n        <p>No courses here yet</p>\r\n        ");
					if (users.getPage() != 1) {
						jteOutput.writeContent("\r\n            <h3><a href=\"");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(NameRoutes.allUsersPath());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("?page=");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(String.valueOf(users.getPage() - 1));
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">One Page back</a></h3>\r\n        ");
					}
					jteOutput.writeContent("\r\n    ");
				} else {
					jteOutput.writeContent("\r\n        ");
					for (var user : users.getUsers()) {
						jteOutput.writeContent("\r\n                <div>\r\n                    <a");
						var __jte_html_attribute_0 = NameRoutes.oneUserPath(String.valueOf(user.getId()));
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
							jteOutput.writeContent(" href=\"");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(__jte_html_attribute_0);
							jteOutput.setContext("a", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(user.getId());
						jteOutput.writeContent(".");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(user.getFirstName());
						jteOutput.writeContent(" ");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(user.getLastName());
						jteOutput.writeContent("</a>\r\n                </div>\r\n        ");
					}
					jteOutput.writeContent("\r\n        ");
					if (users.getPage() != 1) {
						jteOutput.writeContent("\r\n            <h3><a href=\"");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(NameRoutes.allUsersPath());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("?page=");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(String.valueOf(users.getPage() - 1));
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">One Page back</a></h3>\r\n        ");
					}
					jteOutput.writeContent("\r\n        ");
					if (users.getUsers().size() == 5) {
						jteOutput.writeContent("\r\n            <h3><a href=\"");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(NameRoutes.allUsersPath());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("?page=");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(String.valueOf(users.getPage() + 1));
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">One Page forward</a></h3>\r\n        ");
					}
					jteOutput.writeContent("\r\n    ");
					jteOutput.writeContent("\r\n    ");
				}
				jteOutput.writeContent("\r\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <footer>\r\n        <h3><a href=\"https://github.com/SiuSpacecowboy\">My github</a></h3>\r\n    </footer>\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage users = (UsersPage)params.get("users");
		render(jteOutput, jteHtmlInterceptor, users);
	}
}
