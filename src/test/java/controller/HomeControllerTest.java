package controller;

import configuration.BaseConfigTest;
import lombok.SneakyThrows;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

public class HomeControllerTest extends BaseConfigTest {

    @Autowired
    private WebApplicationContext wac;
    @Autowired
    private MockHttpSession session;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).dispatchOptions(true).build();
    }

    @Test
    @SneakyThrows
    public void test_indexGet() {
        this.mockMvc.perform(get("/").session(session)
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    @SneakyThrows
    public void test_homeGet() {
        this.mockMvc.perform(get("/home").session(session)
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(view().name("home"));
    }

    @Test
    @SneakyThrows
    public void test_createGet() {
        this.mockMvc.perform(get("/create").session(session)
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(view().name("create"));
    }

    @Test
    @SneakyThrows
    public void test_updateGet() {
        this.mockMvc.perform(get("/update").session(session)
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(view().name("update"));
    }

    @Test
    @SneakyThrows
    public void test_deleteGet() {
        this.mockMvc.perform(get("/delete").session(session)
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(view().name("delete"));
    }

    @Test
    @SneakyThrows
    public void test_simpleModelGet() {
        ResultActions result = this.mockMvc.perform(get("/simpleModel").session(session)
                .accept(MediaType.TEXT_HTML))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.model().attributeExists("nav")) // HomeController -> model.addAttribute("nav", "home");
                .andExpect(view().name("home"));

      result.andDo(MockMvcResultHandlers.print());
    }

}
