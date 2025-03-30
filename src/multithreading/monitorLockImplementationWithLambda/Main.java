package multithreading.monitorLockImplementationWithLambda;

import multithreading.monitorLock1WithoutLambda.SharedResource;

import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread produceItem = new Thread(()-> sharedResource.addItems());
        Thread consumeItem = new Thread(()-> sharedResource.consumeItems());
        produceItem.start();
        consumeItem.start();
        System.out.println("Main method end");
    }
}
