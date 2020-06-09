package cn.aylog.gmall.member.service.impl;

import cn.aylog.gmall.member.bean.UmsMember;
import cn.aylog.gmall.member.mapper.MemberMapper;
import cn.aylog.gmall.member.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements IMemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<UmsMember> getAll(){
        return memberMapper.selectAll();
    }

}
