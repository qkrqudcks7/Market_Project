package project.traditionalmarket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import project.traditionalmarket.domain.Main;
import project.traditionalmarket.domain.MapForm;
import project.traditionalmarket.dto.Avg;
import project.traditionalmarket.dto.MapOrder;
import project.traditionalmarket.repository.MainRepository;
import project.traditionalmarket.service.AvgService;

@Controller
@RequiredArgsConstructor
public class MapController {

    private final MainRepository mainRepository;
    private final AvgService avgService;

    @GetMapping("/map")
    public String mapPage() {
        return "map";
    }

    @GetMapping("/test0")
    public String map0(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("서울");
        return "preference";
    }

    @GetMapping("/test1")
    public String map1(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("부산");;
        return "preference";
    }

    @GetMapping("/test2")
    public String map2(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("대구");
        return "preference";
    }

    @GetMapping("/test3")
    public String map3(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("인천");
        return "preference";
    }

    @GetMapping("/test4")
    public String map4(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("광주");
        return "preference";
    }

    @GetMapping("/test5")
    public String map5(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("대전");
        return "preference";
    }

    @GetMapping("/test6")
    public String map6(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("울산");
        return "preference";
    }

    @GetMapping("/test7")
    public String map7(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("경기");
        return "preference";
    }

    @GetMapping("/test8")
    public String map8(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("강원");
        return "preference";
    }

    @GetMapping("/test9")
    public String map9(@ModelAttribute("mapForm") MapForm mapForm,
                       @ModelAttribute("mapOrder") MapOrder mapOrder,
                       Model model){
        mapForm.setName("충남");
        return "preference";
    }

    @GetMapping("/test10")
    public String map10(@ModelAttribute("mapForm") MapForm mapForm,
                        @ModelAttribute("mapOrder") MapOrder mapOrder,
                        Model model){
        mapForm.setName("충북");
        return "preference";
    }

    @GetMapping("/test11")
    public String map11(@ModelAttribute("mapForm") MapForm mapForm,
                        @ModelAttribute("mapOrder") MapOrder mapOrder,
                        Model model){
        mapForm.setName("전북");
        return "preference";
    }

    @GetMapping("/test12")
    public String map12(@ModelAttribute("mapForm") MapForm mapForm,
                        @ModelAttribute("mapOrder") MapOrder mapOrder,
                        Model model){
        mapForm.setName("전남");
        return "preference";
    }

    @GetMapping("/test13")
    public String map13(@ModelAttribute("mapForm") MapForm mapForm,
                        @ModelAttribute("mapOrder") MapOrder mapOrder,
                        Model model){
        mapForm.setName("경북");
        return "preference";
    }

    @GetMapping("/test14")
    public String map14(@ModelAttribute("mapForm") MapForm mapForm,
                        @ModelAttribute("mapOrder") MapOrder mapOrder,
                        Model model){
        mapForm.setName("경남");
        return "preference";
    }

    @GetMapping("/test15")
    public String map15(@ModelAttribute("mapForm") MapForm mapForm,
                        @ModelAttribute("mapOrder") MapOrder mapOrder,
                        Model model){
        mapForm.setName("제주");
        return "preference";
    }

    @GetMapping("/test16")
    public String map16(@ModelAttribute("mapForm") MapForm mapForm,
                        @ModelAttribute("mapOrder") MapOrder mapOrder,
                        Model model){
        mapForm.setName("세종");
        return "preference";
    }

    @PostMapping("/total")
    public String mapOrder0(MapForm mapForm,
                            String priority1, String priority2 , String priority3,
                            Model model) {

        model.addAttribute("nation",mapForm.getName());
        model.addAttribute("priority1",priority1);
        model.addAttribute("priority2",priority2);
        model.addAttribute("priority3",priority3);

        return "information";
    }

    @GetMapping("/search/{nation}/{priority1}/{priority2}/{priority3}")
    public String mapSearch(@PathVariable String nation,
                            @PathVariable String priority1,
                            @PathVariable String priority2,
                            @PathVariable String priority3,
                            String keyword,
                            Model model,
                            @PageableDefault(size = 5) Pageable pageable) {
        Page<Main> page = mainRepository.findByKeyword(keyword, nation, pageable,priority1,priority2,priority3);
        model.addAttribute("page",page);
        model.addAttribute("keyword",keyword);
        model.addAttribute("maxPage",10);
        return "informationSearch";
    }

    @GetMapping("/readPage")
    public String read(@RequestParam("id") Long id,
                       @RequestParam("keyword") String keyword,
                       Avg avg,
                       Model model) {
        Main main = mainRepository.findById(id).get();
        String market=main.getMarketName();
        String key=main.getKindName();
        model.addAttribute(main);

        double one = avgService.return1(key, avg, market);
        model.addAttribute("one",one);
        double two = avgService.return2(key, avg, market);
        model.addAttribute("two",two);
        double three = avgService.return3(key, avg, market);
        model.addAttribute("three",three);
        double four = avgService.return4(key, avg, market);
        model.addAttribute("four",four);
        double five = avgService.return5(key, avg, market);
        model.addAttribute("five",five);
        double six = avgService.return6(key, avg, market);
        model.addAttribute("six",six);
        double seven = avgService.return7(key, avg, market);
        model.addAttribute("seven",seven);
        double eight = avgService.return8(key, avg, market);
        model.addAttribute("eight",eight);
        double nine = avgService.return9(key, avg, market);
        model.addAttribute("nine",nine);
        double ten = avgService.return10(key, avg, market);
        model.addAttribute("ten",ten);
        double eleven = avgService.return11(key, avg, market);
        model.addAttribute("eleven",eleven);

        return "detail";
    }
}
