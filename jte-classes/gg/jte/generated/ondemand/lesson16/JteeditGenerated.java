package gg.jte.generated.ondemand.lesson16;
import exercise.lesson16.dto.UserEditPageWithErrors;
public final class JteeditGenerated {
	public static final String JTE_NAME = "lesson16/edit.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,5,5,5,5,5,9,9,9,9,9,9,9,9,9,15,15,15,15,15,15,15,15,15,21,21,21,21,21,21,21,21,21,27,27,27,27,27,27,27,27,27,38,38,40,40,41,41,42,42,42,43,43,44,44,46,46,48,48,48,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserEditPageWithErrors errors) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html>\r\n<form action=\"/users/");
		jteOutput.setContext("form", "action");
		jteOutput.writeUserContent(String.valueOf(errors.getId()));
		jteOutput.setContext("form", null);
		jteOutput.writeContent("\" method=\"post\">\r\n    <div>\r\n        <label>\r\n            Name\r\n            <input type=\"text\" required name=\"firstname\"");
		var __jte_html_attribute_0 = errors.getFirstName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Surname\r\n            <input type=\"text\" required name=\"lastname\"");
		var __jte_html_attribute_1 = errors.getLastName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Email\r\n            <input type=\"email\" required name=\"email\"");
		var __jte_html_attribute_2 = errors.getEmail();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_2);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Password\r\n            <input type=\"password\" required name=\"password\"");
		var __jte_html_attribute_3 = errors.getPassword();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_3);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            ConfirmPass\r\n            <input type=\"password\" required name=\"confirm\"/>\r\n        </label>\r\n    </div>\r\n    <input type=\"submit\" value=\"Edit\" />\r\n</form>\r\n");
		if (errors.getErrors() != null) {
			jteOutput.writeContent("\r\n    <ul>\r\n        ");
			for (var values : errors.getErrors().values()) {
				jteOutput.writeContent("\r\n            ");
				for (var value : values) {
					jteOutput.writeContent("\r\n                <li style=\"color:red\">");
					jteOutput.setContext("li", null);
					jteOutput.writeUserContent(value.getMessage());
					jteOutput.writeContent("</li>\r\n            ");
				}
				jteOutput.writeContent("\r\n        ");
			}
			jteOutput.writeContent("\r\n    </ul>\r\n");
		}
		jteOutput.writeContent("\r\n\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserEditPageWithErrors errors = (UserEditPageWithErrors)params.get("errors");
		render(jteOutput, jteHtmlInterceptor, errors);
	}
}
