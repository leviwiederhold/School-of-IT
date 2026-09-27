package edu.uc.facultydirectory.controller;

import edu.uc.facultydirectory.model.Faculty;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/Faculties")
public class FacultyController {
    private final List<Faculty> facultyMembers = new ArrayList<>();

    @PostConstruct
    public void loadFaculty() {
        facultyMembers.add(new Faculty(1, "Alex", "Morgan", "Professor", "alex.morgan@example.edu"));
        facultyMembers.add(new Faculty(2, "Jamie", "Rivera", "Associate Professor", "jamie.rivera@example.edu"));
        facultyMembers.add(new Faculty(3, "Taylor", "Chen", "Assistant Professor", "taylor.chen@example.edu"));
    }

    @GetMapping({"", "/", "/list"})
    public String listFaculty(Model model) {
        model.addAttribute("theFaculties", facultyMembers);
        return "faculty-list";
    }
}
