package gg.jte.generated.ondemand.lesson15;
import exercise.lesson15_crud.UsersPage;
import main_project.util.NameRoutes;
public final class JteuserslistGenerated {
	public static final String JTE_NAME = "lesson15/users-list.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,8,8,15,15,15,15,16,16,19,19,19,19,19,19,19,19,20,20,21,21,23,23,23,23,23,23,23,23,24,24,26,26,26,26,26,26,26,26,26,27,27,28,28,28,28,28,28,28,28,29,29,30,30,31,31,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,34,34,35,35,36,36,36,36,36,36,36,36,37,37,38,38,39,39,39,39,39,39,39,39,40,40,41,44,44,45,45,46,46,46,46,53,53,53,53,53,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage users) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.main_project.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <header>\r\n        <div class=\"stroke-black\">\r\n        <h1><a href=\"/\">Home page</a></h1>\r\n        <h1><p style=\"color:white\">All users:</p></h1>\r\n        </div>\r\n    </header>\r\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    ");
				if (users.getPage() <= 0) {
					jteOutput.writeContent("\r\n        <h2><p style=\"color:rgb(254, 111, 94)\">Page can't be less than 1.</p></h2>\r\n        <h2><p style=\"color:rgb(254, 111, 94)\">To the 1st page:</p></h2>\r\n        <h1><a style=\"color:rgb(199, 21, 133)\" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(NameRoutes.allUsersPath());
					jteOutput.setContext("a", null);
					jteOutput.writeContent("?page=");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(1);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\">First page</a></h1>\r\n    ");
				} else {
					jteOutput.writeContent("\r\n    ");
					if (users.getUsers().isEmpty() && users.isHaveUsers()) {
						jteOutput.writeContent("\r\n        <h2><p style=\"color:rgb(254, 111, 94)\">Database doesn't have so many users.</p></h2>\r\n        <h2><a style=\"color:rgb(199, 21, 133)\" href=\"");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(NameRoutes.allUsersPath());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("?page=");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(String.valueOf(users.getFinalPage()));
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">Last page</a></h2>\r\n    ");
					} else if (users.getUsers().isEmpty()) {
						jteOutput.writeContent("\r\n        <h2><p style=\"color:rgb(225, 149, 243)\">There are no users in the database.</p></h2>\r\n        <h2><a style=\"color:rgb(0, 191, 255)\"");
						var __jte_html_attribute_0 = NameRoutes.buildUserPath();
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
							jteOutput.writeContent(" href=\"");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(__jte_html_attribute_0);
							jteOutput.setContext("a", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">Create new User</a></h2>\r\n        ");
						if (users.getPage() != 1) {
							jteOutput.writeContent("\r\n            <h1><a style=\"color:rgb(199, 21, 133)\" href=\"");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(NameRoutes.allUsersPath());
							jteOutput.setContext("a", null);
							jteOutput.writeContent("?page=");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(1);
							jteOutput.setContext("a", null);
							jteOutput.writeContent("\">First page</a></h1>\r\n        ");
						}
						jteOutput.writeContent("\r\n    ");
					} else {
						jteOutput.writeContent("\r\n        ");
						for (var user : users.getUsers()) {
							jteOutput.writeContent("\r\n                    <h3><a style=\"color:rgb(225, 149, 243)\"");
							var __jte_html_attribute_1 = NameRoutes.oneUserPath(String.valueOf(user.getId()));
							if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
								jteOutput.writeContent(" href=\"");
								jteOutput.setContext("a", "href");
								jteOutput.writeUserContent(__jte_html_attribute_1);
								jteOutput.setContext("a", null);
								jteOutput.writeContent("\"");
							}
							jteOutput.writeContent("><strong>");
							jteOutput.setContext("strong", null);
							jteOutput.writeUserContent(user.getId());
							jteOutput.writeContent(".");
							jteOutput.setContext("strong", null);
							jteOutput.writeUserContent(user.getFirstName());
							jteOutput.writeContent(" ");
							jteOutput.setContext("strong", null);
							jteOutput.writeUserContent(user.getLastName());
							jteOutput.writeContent("</strong></a></h3>\r\n                    <br>\r\n        ");
						}
						jteOutput.writeContent("\r\n        ");
						if (users.getPage() != 1) {
							jteOutput.writeContent("\r\n            <h2><a style=\"color:rgb(199, 21, 133)\" href=\"");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(NameRoutes.allUsersPath());
							jteOutput.setContext("a", null);
							jteOutput.writeContent("?page=");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(String.valueOf(users.getPage() - 1));
							jteOutput.setContext("a", null);
							jteOutput.writeContent("\">One Page back</a></h2>\r\n        ");
						}
						jteOutput.writeContent("\r\n        ");
						if (users.getUsers().size() == 5) {
							jteOutput.writeContent("\r\n            <h1><a style=\"color:rgb(199, 21, 133)\" href=\"");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(NameRoutes.allUsersPath());
							jteOutput.setContext("a", null);
							jteOutput.writeContent("?page=");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(String.valueOf(users.getPage() + 1));
							jteOutput.setContext("a", null);
							jteOutput.writeContent("\">One Page forward</a></h1>\r\n        ");
						}
						jteOutput.writeContent("\r\n    ");
						jteOutput.writeContent("\r\n    ");
					}
					jteOutput.writeContent("\r\n    ");
				}
				jteOutput.writeContent("\r\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <footer>\r\n        <br>\r\n        <div class=\"stroke-black\">\r\n        <h1><a style=\"color:rgb(127, 255, 212)\" href=\"https://github.com/SiuSpacecowboy\">My github</a></h1>\r\n        </div>\r\n    </footer>\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage users = (UsersPage)params.get("users");
		render(jteOutput, jteHtmlInterceptor, users);
	}
}
