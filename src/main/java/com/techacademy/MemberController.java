package com.techacademy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @GetMapping
    public List<Member> getAllMembers() {
        // ここで実際のデータベースからメンバーを取得するなどの処理を行うことが一般的ですが、
        // 今回は簡単のためにダミーデータを返します。
        List<Member> members = new ArrayList<>();
        members.add(new Member(1, "John Doe", "Male", 25));
        members.add(new Member(2, "Jane Doe", "Female", 28));
        return members;
    }
}