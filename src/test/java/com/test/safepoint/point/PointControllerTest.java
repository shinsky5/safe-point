package com.test.safepoint.point;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.safepoint.database.UserTables;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.doNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = PointController.class)
@AutoConfigureMockMvc
class PointControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @SuppressWarnings("removal")
    @MockBean
    private PointService pointService;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void charge() throws Exception {
        // given

        UserTables user = new UserTables();
        User fst = user.save(1000);

        Long userId = fst.getId();
        int amount = fst.getPoints();
        // PointService.charge(...)는 void 메서드이므로 doNothing() 설정
        doNothing().when(pointService).charge(userId, amount);

        // when & then
        mockMvc.perform(
                        patch("/points/{userId}/charge", userId)
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(amount))
                )
                .andExpect(status().isOk());
    }

    @Test
    void getBalance() {
    }

    @Test
    void use() {
    }
}