package com.example.helloworld;



import com.google.events.cloud.pubsub.v1.Message;
import com.google.events.cloud.pubsub.v1.MessagePublishedData;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public ResponseEntity<String> receiveMessage(
      @RequestBody MessagePublishedData body, @RequestHeader Map<String, String> headers) {

    Message message = body.getMessage();
    System.out.println(
        new String(Base64.getDecoder().decode(message.getData()), StandardCharsets.UTF_8));
    System.out.println(message.getMessageId());
    System.out.println(headers.get("ce-source"));

    return new ResponseEntity<String>("received!", HttpStatus.OK);
  }
}
