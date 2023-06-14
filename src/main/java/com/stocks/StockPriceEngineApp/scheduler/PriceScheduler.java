package com.stocks.StockPriceEngineApp.scheduler;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.stocks.StockPriceEngineApp.dto.Company;
@Component
public class PriceScheduler {
	List<Integer> bidPriceApple=Arrays.asList(51,45,40);
	List<Integer> bidPriceibm=Arrays.asList(59,58,50);
	List<Integer> bidPriceZensar=Arrays.asList(60,56,40);
	@Scheduled(fixedDelay=3000)
	public void updatestocktradingapp() {
        Random random=new Random();
        int a=random.nextInt(3);
        System.out.println(a);
            if(Company.APPLE.getId()==a) {
            	int nextBidPrice = random.nextInt(1000);
                System.out.println("bid random : "+nextBidPrice);
                if(nextBidPrice >= bidPriceApple.get(bidPriceApple.size()-1)) {
                	bidPriceApple.set(bidPriceApple.size()-1, nextBidPrice);
                }
                Collections.sort(bidPriceApple,Collections.reverseOrder());
                System.out.println(bidPriceApple);
                
            }
            else if(Company.IBM.getId()==a){
            	int nextBidPrice = random.nextInt(1000);
                System.out.println("bid random : "+nextBidPrice);
                if(nextBidPrice >= bidPriceibm.get(bidPriceibm.size()-1)) {
                	bidPriceibm.set(bidPriceibm.size()-1, nextBidPrice);
                }
                Collections.sort(bidPriceibm,Collections.reverseOrder());
                System.out.println(bidPriceibm);
            }
            else if(Company.Zensar.getId()==a){
            	int nextBidPrice = random.nextInt(1000);
                System.out.println("bid random : "+nextBidPrice);
                if(nextBidPrice >= bidPriceZensar.get(bidPriceibm.size()-1)) {
                	bidPriceZensar.set(bidPriceZensar.size()-1, nextBidPrice);
                }
                Collections.sort(bidPriceZensar,Collections.reverseOrder());
                System.out.println(bidPriceZensar);
            }
        }
    }

