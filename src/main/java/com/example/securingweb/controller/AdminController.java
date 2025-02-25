package com.example.securingweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class AdminController {

    @GetMapping("/admin")
    public String adminHome(Model model) {
        // Thêm bất kỳ mô hình dữ liệu nào bạn muốn truyền tới view
        model.addAttribute("message", "Welcome to the Admin Dashboard!");
        return "adminHome"; // Trả về view tên là "adminHome"
    }

    // Bạn có thể thêm các phương thức khác để xử lý các nghiệp vụ quản trị khác tại đây
}
