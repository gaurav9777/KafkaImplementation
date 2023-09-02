# KafkaImplementation

## userSide :
#### user will consume the location record .

## driverSide:
#### it will produce the location record.

## for starting the zookeeper in windows :
* bin/windows/zookeeper-server-start.bat config/zookeeper.properties

## start the kafka server : 
*  bin/windows/kafka-server-start.bat config/server.properties

##### we are creating the topic from spring boot application using **TopicBuilder method ** but from console also we can create the topic 

## cerate the topic :
* bin/windows/kafka-topics.bat --create --topic topic_name --bootstrap-server localhost:9092
## write some events into topic (produce)
* bin/windows/kafka-console-producer.bat --topic topic_name --bootstrap-server localhost:9092
## read some events (comsumer)
* bin/windows/kafka-console-consumer.bat --topic topic_name --from-beginning --bootstrap-server localhost:9092
