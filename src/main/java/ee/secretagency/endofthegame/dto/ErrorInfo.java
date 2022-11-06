package ee.secretagency.endofthegame.dto;

import lombok.Builder;
import java.time.ZonedDateTime;


@Builder
public record ErrorInfo(
        ZonedDateTime timestamp,
        int status,
        String error,
        String message,
        String path
) {
}



        /*
        "timestamp": "2022-11-06T10:53:32.247+00:00",
        "status": 404,
        "error": "Not Found",
        "message": "No message available",
        "path": "/api/incomedaffes/1"
        }*/

