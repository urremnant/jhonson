package kkkim.com.jhonson.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
		model.addAttribute("name",name);
		return "/webPage/welCome";
	}
	
	@RequestMapping("/vueSample")
	public String vueSample(Model model, @RequestParam(value="name",required=false, defaultValue="Ȧ������") String name) {
		model.addAttribute("name",name);
		return "/webPage/pageSample";
	}
}