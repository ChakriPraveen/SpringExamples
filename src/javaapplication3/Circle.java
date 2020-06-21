/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

/**
 *
 * @author 310212371
 */
@Component
public class Circle implements Shape,ApplicationEventPublisherAware{
    
    private Point center;
    private ApplicationEventPublisher publisher;
    @Autowired
    private MessageSource messageSource;
    @Override
    public void draw() {
        Object[] point = {center.getX(),center.getY()};
        System.out.println(messageSource.getMessage("draw.circle", null, "default draw circle", null));
        //System.out.println("centre is: "+center.getX()+","+center.getY());
        System.out.println(messageSource.getMessage("circle.point", point, "default point circle", null));
        DrawEvent drawEvent = new DrawEvent(this);
        publisher.publishEvent(drawEvent);
    }

    /**
     * @return the center
     */
    public Point getCenter() {
        return center;
    }

    /**
     * @param center the center to set
     */
//    @Required
//    @Autowired
//    @Qualifier("CircleRequired")
    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }
    
    @PostConstruct
    public void initilazieCircle(){
        System.out.println("Initialize the Circle");
    }
    
    @PreDestroy
    public void DestroyCircle(){
        System.out.println("Destory the Circle");
    }

    /**
     * @return the messageSource
     */
    public MessageSource getMessageSource() {
        return messageSource;
    }

    /**
     * @param messageSource the messageSource to set
     */
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
