package gg.jte.generated.ondemand.main_project.users;
import main_project.dto.UserPageWithErrors;
public final class JtenewuserGenerated {
	public static final String JTE_NAME = "main_project/users/new-user.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,36,36,42,42,44,44,44,48,48,54,54,54,54,54,54,54,54,54,60,60,60,60,60,60,60,60,60,66,66,66,66,66,66,66,66,66,86,86,88,88,89,89,90,90,90,91,91,92,92,94,94,96,97,97,97,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPageWithErrors errors) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\r\n          rel=\"stylesheet\"\r\n          integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\r\n          crossorigin=\"anonymous\">\r\n    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n    <title>Create User♂</title>\r\n    <style>\r\n   .message {\r\n    left: 95%;\r\n    top: 104.5%;\r\n    margin-left: -25%;\r\n    position: absolute;\r\n    margin-top: -25%;\r\n}\r\nform {\r\n    left      : 50%;\r\n    top       : 50%;\r\n    position  : absolute;\r\n    transform : translate(-50%, -50%);\r\n}\r\n   .stroke {\r\n    text-shadow: white 1px 1px 0, white -1px -1px 0,\r\n                 white -1px 1px 0, white 1px -1px 0;\r\n   }\r\n  </style>\r\n</head>\r\n");
		jteOutput.writeContent("\r\n<div class=\"bg-image\"\r\n     style=\"\r\n    background-image: url('http://cdn-st2.rtr-vesti.ru/vh/pictures/hd/352/132/1.jpg');\r\n    height: 100vh;\r\n  \">\r\n    ");
		if (errors.getFlash() != null) {
			jteOutput.writeContent("\r\n        <div class=\"alert alert-danger alert-dismissible fade show\" role=\"alert\">\r\n            <strong>");
			jteOutput.setContext("strong", null);
			jteOutput.writeUserContent(errors.getFlash());
			jteOutput.writeContent("</strong>♂♂♂\r\n            <button type=\"button\" class=\"btn-close\" data-dismiss=\"alert\" aria-label=\"Close\">\r\n            </button>\r\n        </div>\r\n    ");
		}
		jteOutput.writeContent("\r\n    <form id=\"form_login\" action=\"/users\" method=\"post\">\r\n            <div class=\"row\">\r\n                <div class=\"col\">\r\n                    <label class=\"form-label\">\r\n                        <p class=\"stroke\"><strong>Name</strong></p>\r\n                        <input type=\"text\" class=\"form-control\" required name=\"firstname\"");
		var __jte_html_attribute_0 = errors.getFirstName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n                    </label>\r\n                </div>\r\n                <div class=\"col\">\r\n                    <label class=\"form-label\">\r\n                        <p class=\"stroke\"><strong>Surname</strong></p>\r\n                        <input type=\"text\" class=\"form-control\" required name=\"lastname\"");
		var __jte_html_attribute_1 = errors.getLastName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_1);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n                    </label>\r\n                </div>\r\n                <div class=\"col\">\r\n                    <label class=\"form-label\">\r\n                        <p class=\"stroke\"><strong>Email</strong></p>\r\n                        <input type=\"email\" class=\"form-control\" required name=\"email\"");
		var __jte_html_attribute_2 = errors.getEmail();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_2);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n                    </label>\r\n                </div>\r\n            </div>\r\n            <div class=\"row\">\r\n                <div class=\"col\">\r\n                    <label class=\"form-label\">\r\n                        <p class=\"stroke\"><strong>Password</strong></p>\r\n                        <input type=\"password\" class=\"form-control\" required name=\"password\"/>\r\n                    </label>\r\n                </div>\r\n                <div class=\"col-4\">\r\n                    <label class=\"form-label\">\r\n                        <p class=\"stroke\"><strong>ConfirmPass</strong></p>\r\n                        <input type=\"password\" class=\"form-control\" required name=\"confirm\"/>\r\n                    </label>\r\n                </div>\r\n                <input type=\"submit\" class=\"btn btn-primary\" value=\"Register\" />\r\n            </div>\r\n    </form>\r\n    ");
		if (errors.getErrors() != null) {
			jteOutput.writeContent("\r\n        <div class=\"message\">\r\n            ");
			for (var values : errors.getErrors().values()) {
				jteOutput.writeContent("\r\n                ");
				for (var value : values) {
					jteOutput.writeContent("\r\n                    <li style=\"color:red\">");
					jteOutput.setContext("li", null);
					jteOutput.writeUserContent(value.getMessage());
					jteOutput.writeContent("</li>\r\n                ");
				}
				jteOutput.writeContent("\r\n            ");
			}
			jteOutput.writeContent("\r\n        </div>\r\n    ");
		}
		jteOutput.writeContent("\r\n</div>\r\n");
		jteOutput.writeContent("\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPageWithErrors errors = (UserPageWithErrors)params.get("errors");
		render(jteOutput, jteHtmlInterceptor, errors);
	}
}
