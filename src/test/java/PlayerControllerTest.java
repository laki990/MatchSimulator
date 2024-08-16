import com.nikolic.matchsimulator.controller.PlayerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = PlayerController.class) // Specify your main application class here
@AutoConfigureMockMvc
public class PlayerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAddNewPlayer() throws Exception {
        String playerJson = "{\"name\": \"Lazar Nikolic\", \"ranking\": 10, \"position\": \"DEFENDER\", \"team\": {\"id\": 1}}";

        mockMvc.perform(post("/player")
                        .contentType("application/json")
                        .content(playerJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name").value("Lazar Nikolic"))
                .andExpect(jsonPath("$.ranking").value(10))
                .andExpect(jsonPath("$.position").value("DEFENDER"))
                .andExpect(jsonPath("$.team.id").value(1));
    }
}
