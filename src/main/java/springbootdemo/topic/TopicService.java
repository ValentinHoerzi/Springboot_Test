package springbootdemo.topic;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TopicService {

   private List<Topic> topics =new ArrayList<>( Arrays.asList(
           new Topic("spring","Spring Framework","desc"),
           new Topic("java","Mockito Framework","desc"),
           new Topic("javascript","Angular Framework","desc")
   ));

   public List<Topic> getAllTopics(){
       return topics;
   }

   public Topic getTopic(String id){
       return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
   }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
       for(Topic t : topics){
           if(t.getId().equals(id)){
               topics.set(topics.indexOf(t),topic);
               return;
           }
       }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
