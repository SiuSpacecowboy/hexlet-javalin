package gg.jte.generated.ondemand.main_project.layout;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "main_project/layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,14,14,14,15,15,15,16,16,18,18,18,20,20,21,21,21,22,22,25,25,25,2,3,4,4,4,4};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content header, Content content, Content footer) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <title>Hello Hexlet!</title>\r\n</head>\r\n<body>\r\n");
		if (header != null) {
			jteOutput.writeContent("\r\n    ");
			jteOutput.setContext("body", null);
			jteOutput.writeUserContent(header);
			jteOutput.writeContent("\r\n");
		}
		jteOutput.writeContent("\r\n<div>\r\n    ");
		jteOutput.setContext("div", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n</div>\r\n");
		if (footer != null) {
			jteOutput.writeContent("\r\n    ");
			jteOutput.setContext("body", null);
			jteOutput.writeUserContent(footer);
			jteOutput.writeContent("\r\n");
		}
		jteOutput.writeContent("\r\n</body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content header = (Content)params.get("header");
		Content content = (Content)params.get("content");
		Content footer = (Content)params.get("footer");
		render(jteOutput, jteHtmlInterceptor, header, content, footer);
	}
}
