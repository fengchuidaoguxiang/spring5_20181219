package di;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@ToString
public class ValueBean {
    @Value("${server.port}")
    private int port;
}
