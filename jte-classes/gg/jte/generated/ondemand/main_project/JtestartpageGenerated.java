package gg.jte.generated.ondemand.main_project;
import main_project.util.NameRoutes;
import main_project.dto.UserPage;
public final class JtestartpageGenerated {
	public static final String JTE_NAME = "main_project/start-page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,3,8,8,9,9,11,11,11,15,15,16,16,18,18,18,25,25,30,30,31,32,32,32,32,34,34,34,34,34,34,34,34,34,35,35,35,35,35,35,35,35,35,39,40,41,41,41,41,41,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage page) {
		gg.jte.generated.ondemand.main_project.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, null, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    ");
				if (page.getFlash() != null) {
					jteOutput.writeContent("\r\n        <div class=\"alert alert-success alert-dismissible fade show\" role=\"alert\">\r\n            <strong>");
					jteOutput.setContext("strong", null);
					jteOutput.writeUserContent(page.getFlash());
					jteOutput.writeContent("!💦💦💦</strong>\r\n            <button type=\"button\" class=\"btn-close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n            </button>\r\n        </div>\r\n    ");
				}
				jteOutput.writeContent("\r\n    ");
				if (page.getUser() != null) {
					jteOutput.writeContent("\r\n        <div class=\"stroke-black\">\r\n        <h1><p style=\"color:rgb(255, 69, 0)\">WELCOME TO THE CLUB, ");
					jteOutput.setContext("p", null);
					jteOutput.writeUserContent(page.getUser().getFirstName().toUpperCase());
					jteOutput.writeContent("♂♂♂</p></h1>\r\n        <h2><p style=\"color:rgb(240, 230, 140)\">To Unlogin, please delete cookie JSESSIONID from browser | This cookie response for all sessions.</p></h2>\r\n        <h3><form action=\"/sessions/delete\" method=\"post\">\r\n                <input type=\"submit\" value=\"Another Unlogin\">\r\n            </form></h3>\r\n        <br>\r\n        </div>\r\n    ");
				} else {
					jteOutput.writeContent("\r\n        <div class=\"stroke-black\">\r\n        <h1><p style=\"color:rgb(255, 69, 0)\">WELCOME TO THE CLUB, Please Cum In♂♂♂</p></h1>\r\n        <h2><a style=\"color:rgb(240, 230, 140)\" href=\"/sessions/build\">Cum In</a></h2>\r\n        </div>\r\n    ");
				}
				jteOutput.writeContent("\r\n  ");
				jteOutput.writeContent("\r\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <div class=\"stroke-black\">\r\n    <h2><a style=\"color:rgb(0, 191, 255)\"");
				var __jte_html_attribute_0 = NameRoutes.allUsersPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">To All users page</a></h2>\r\n    <h2><a style=\"color:rgb(0, 191, 255)\"");
				var __jte_html_attribute_1 = NameRoutes.buildUserPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Create new User</a></h2>\r\n    <br>\r\n    <h2><a style=\"color:rgb(127, 255, 212)\" href=\"https://github.com/SiuSpacecowboy\">My github</a></h2>\r\n    </div>\r\n    ");
				jteOutput.writeContent("\r\n    ");
				jteOutput.writeContent("\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPage page = (UserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
