package kkkim.com.jhonson.web;

import org.springframework.boot.web.server.MimeMappings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller�� ������� �����Ͻø� �˴ϴ�.
 * �ƴϸ� ���״�� ���� ��Ʈ�ѷ���� �޾Ƶ鿩���˴ϴ�.
 * ��......������Ʈ�ѷ��� �Ѱ��ӱ⿡ ������ �������� ����?
 * �굵 ���������� ��Ʈ�ѷ��� ������ �ϼ� �ֽ��ϴ�. �� ��Ʈ�ѷ��� ������� �Ҵ�ǰ� ����� ������ �Է��ϳ��� ���� ����������
 * ������ �������̸� �غ������� �ֳ���?
 * ���� ��Ʈ�ѷ��� �Ѵ� �������� �����ϴ°� �ƴ϶� �Ѹ��� �������� ��Ʈ�� �ϰ� �Ѹ��� ���ڸ� ��Ʈ�� �մϴ�.
 * ��Ʈ�ѷ��� ���������� ���ڸ��� ���� ������ �ٸ��� ����?
 * ���⼭�� �� �����̳� ȭ����� ����µ� �����ϰ� �����ϴ� ������Ʈ �Ŵ���(project manager)�� ��Ʈ�ѷ���� �����սô�.
 * ���ڸ��� ������ �ٸ�����?
 * �� ���ⱺ���嵵 �������� ���������嵵 �������� Ÿ�ϱ����嵵 ��������.... ���� �ǿ����� ����ϴ� ���, Ȥ�� ���� ���ؾ��� ���»糪, ������ �ٸ�����?
 * �� pm����ü�� �����ϴ� �ָ� controller��� ���� �����ع����ô�..
 * ���� ��Ʈ�ѷ��� �������� ������ 
 * @author ����
 *
 */
@Controller
public class MainController {
	
	@RequestMapping("/main")
	public String test(Model model, @RequestParam(value="name",required=false, defaultValue="Ȧ������") String name) {
		 MimeMappings mappings = new MimeMappings(MimeMappings.DEFAULT);
	        mappings.add("html", "application/vnd.hbbtv.xhtml+xml; charset=utf-8");
	        mappings.add("xhtml", "application/vnd.hbbtv.xhtml+xml; charset=utf-8");
		model.addAttribute("name",name);
		return "index";
	}
	
	@RequestMapping("/vueSample")
	public String vueSample(Model model, @RequestParam(value="name",required=false, defaultValue="Ȧ������") String name) {
		 MimeMappings mappings = new MimeMappings(MimeMappings.DEFAULT);
	        mappings.add("html", "application/vnd.hbbtv.xhtml+xml; charset=utf-8");
	        mappings.add("xhtml", "application/vnd.hbbtv.xhtml+xml; charset=utf-8");
		model.addAttribute("name",name);
		return "/webPage/pageSample";
	}
}