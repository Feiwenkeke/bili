package top.kooriookami.bili.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.kooriookami.bili.pojo.Barrage;

import java.util.ArrayList;


/**
 * Created with IntelliJ IDEA.
 *
 * @author: fei
 * @Date: 2018/4/27
 * @Time: 9:42
 * @Description:
 */
@RestController
@Slf4j
public class IndexController {
    public ArrayList<Barrage> barrages = new ArrayList<>();
    int flag = 0,Max_Size = 100;


    public void reSet(){
        barrages.clear();
        barrages.add(new Barrage("各位下午好哇~(#^.^#)","#6699ff","",""));
        barrages.add(new Barrage("こんにちは www","","",""));
        barrages.add(new Barrage("楼上的两个你们好呀~~~","","",""));
        barrages.add(new Barrage("竟然还有3个小伙伴和我同时在看！(￣ω￣(￣ω￣〃 (￣ω￣〃)ゝ","","",""));
        barrages.add(new Barrage("厂下广卞廿十一卉半与本二上旦上二本与半卉一" +
                "十廿卞广下厂下广卞廿十一卉半与本二上旦上二本与半卉一十廿卞" +
                "广下厂下广卞廿十一卉半与本二上旦上二本与半卉一十廿卞" +
                "广下厂厂下广卞廿十一卉半与本二上旦上二本与半卉一","#ff0000","",""));
        barrages.add(new Barrage("各位下午好哇~(#^.^#)","","",""));
        barrages.add(new Barrage("各位下午好哇~(#^.^#)","","",""));
        barrages.add(new Barrage("各位下午好哇~(#^.^#)","","",""));
        log.info("List barrages has been reset");
        flag=1;
    }

    @GetMapping(value = "/getAll")
    public ArrayList<Barrage> getAll(){
        if (flag==0){
            reSet();
        }
        return barrages;
    }

    @PutMapping(value ="/addOne")
    public String addOne(@RequestBody Barrage b){
        System.out.println(b.toString());
        if (barrages.size()>=Max_Size){
            barrages.remove(barrages.get(0));
        }
        barrages.add(b);
        return "OK";
    }

    @GetMapping(value = "/reSet/{key}")
    public String to_reSetAll(@PathVariable String key){
        if (key.equals("233")){
            log.info("成功通过reSet接口重置");
            reSet();

            return "OK";
        }

        return "ERROR";
    }


}
