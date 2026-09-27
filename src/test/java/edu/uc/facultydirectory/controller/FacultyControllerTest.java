package edu.uc.facultydirectory.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(FacultyController.class)
class FacultyControllerTest {
    @Autowired private MockMvc mockMvc;

    @Test
    void listEndpointRendersFacultyDirectory() throws Exception {
        mockMvc.perform(get("/Faculties/list"))
                .andExpect(status().isOk())
                .andExpect(view().name("faculty-list"))
                .andExpect(model().attribute("theFaculties", hasSize(3)))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("School of IT Faculty Directory")));
    }
}
