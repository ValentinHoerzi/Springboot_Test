package springbootdemo.topic;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TopicService {

   private List<Topic> topics = Arrays.asList(
           new Topic("spring","Spring Framework","desc"),
           new Topic("java","Mockito Framework","desc"),
           new Topic("javascript","Angular Framework","desc")
   );

   public List<Topic> getAllTopics(){
       return topics;
   }
}
