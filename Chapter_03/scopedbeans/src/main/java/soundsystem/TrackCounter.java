package soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

@Aspect
public class TrackCounter {
private Map<Integer,Integer> trackCount = new HashMap<Integer,Integer>();

@Pointcut("execution(* soundsystem.CompactDisc.playTrack(int)) " + "&& args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
    int currentCount = getPlayCount(trackNumber);
    trackCount.put(trackNumber,currentCount +1);
    }

    public int getPlayCount(int trackNumber){
    return trackCount.containsKey(trackNumber) ? trackCount.get(trackNumber) :0;
    }


}