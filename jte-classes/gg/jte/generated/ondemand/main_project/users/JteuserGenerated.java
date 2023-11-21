package gg.jte.generated.ondemand.main_project.users;
import main_project.dto.UserPage;
import main_project.util.NameRoutes;
public final class JteuserGenerated {
	public static final String JTE_NAME = "main_project/users/user.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,8,8,9,9,9,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,14,16,17,17,17,17,17,17,17,17,17,22,22,22,22,22,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage user) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.main_project.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, null, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <h4><p>Id: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.getUser().getId());
				jteOutput.writeContent("</p> </h4>\r\n    <h4><p>Name: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.getUser().getFirstName());
				jteOutput.writeContent("</p> </h4>\r\n    <h4><p>Surname: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.getUser().getLastName());
				jteOutput.writeContent("</p> </h4>\r\n    <h4><p>Email: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.getUser().getEmail());
				jteOutput.writeContent("</p> </h4>\r\n    <h4><p>Password: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(user.getUser().getPassword());
				jteOutput.writeContent("</p> </h4>\r\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <footer>\r\n      ");
				jteOutput.writeContent("\r\n        <h2><a");
				var __jte_html_attribute_0 = NameRoutes.editUserPath(String.valueOf(user.getUser().getId()));
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Edit user</a></h2>\r\n        <h3><a href=\"/\">Home page</a></h3>\r\n        <h3><a href=\"/users\">All users</a></h3>\r\n        <h4><a href=\"https://github.com/SiuSpacecowboy\">My github</a></h4>\r\n    </footer>\r\n");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPage user = (UserPage)params.get("user");
		render(jteOutput, jteHtmlInterceptor, user);
	}
}
