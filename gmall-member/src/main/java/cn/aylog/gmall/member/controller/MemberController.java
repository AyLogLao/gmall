package cn.aylog.gmall.member.controller;

import cn.aylog.gmall.member.bean.UmsMember;
import cn.aylog.gmall.member.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private IMemberService memberService;

    @RequestMapping("getAll")
    @ResponseBody
    public List<UmsMember> getAll(){
        return memberService.getAll();
    }


}
