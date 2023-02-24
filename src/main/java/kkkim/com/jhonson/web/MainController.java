package kkkim.com.jhonson.web;

import org.springframework.boot.web.server.MimeMappings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller는 지도라고 생각하시면 됩니다.
 * 아니면 말그대로 게임 컨트롤러라고 받아들여도됩니다.
 * 음......게임컨트롤러는 한게임기에 여러개 붙을수가 있쥬?
 * 얘도 마찬가지로 컨트롤러가 여러개 일수 있습니다. 각 컨트롤러가 사람에게 할당되고 사람이 무엇을 입력하나에 대해 정해지겠쥬
 * 마리오 오딧세이를 해보신적이 있나요?
 * 같은 컨트롤러라도 둘다 마리오를 조정하는게 아니라 한명은 마리오를 컨트롤 하고 한명은 모자를 컨트롤 합니다.
 * 컨트롤러가 여러개더라도 각자마다 맡은 영역이 다를수 있죠?
 * 여기서는 음 존슨이네 화장실을 만드는데 감독하고 관리하는 프로젝트 매니저(project manager)를 컨트롤러라고 생각합시다.
 * 각자마다 역할이 다르겠죠?
 * 뭐 변기군단장도 있을꺼고 수도군단장도 있을꺼고 타일군단장도 있을꺼고.... 각각 피엠마다 사용하는 용어, 혹은 같이 일해야할 협력사나, 재료등이 다르겠죠?
 * 그 pm들자체를 정의하는 애를 controller라고 대충 생각해버립시다..
 * 게임 컨트롤러는 여러개가 있을수 
 * @author 존슨
 *
 */
@Controller
public class MainController {
	
	@RequestMapping("/main")
	public String test(Model model, @RequestParam(value="name",required=false, defaultValue="홀리몰리") String name) {
		 MimeMappings mappings = new MimeMappings(MimeMappings.DEFAULT);
	        mappings.add("html", "application/vnd.hbbtv.xhtml+xml; charset=utf-8");
	        mappings.add("xhtml", "application/vnd.hbbtv.xhtml+xml; charset=utf-8");
		model.addAttribute("name",name);
		return "index";
	}
	
	@RequestMapping("/vueSample")
	public String vueSample(Model model, @RequestParam(value="name",required=false, defaultValue="홀리몰리") String name) {
		 MimeMappings mappings = new MimeMappings(MimeMappings.DEFAULT);
	        mappings.add("html", "application/vnd.hbbtv.xhtml+xml; charset=utf-8");
	        mappings.add("xhtml", "application/vnd.hbbtv.xhtml+xml; charset=utf-8");
		model.addAttribute("name",name);
		return "/webPage/pageSample";
	}
}