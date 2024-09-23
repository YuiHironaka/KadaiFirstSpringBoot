package com.techacademy;

import java.util.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("dayofweek/{date}")
    public String dispDayOfWeek(@PathVariable String date) {
        String year = date.substring(0,4);
        String month = date.substring(4,6);
        String day = date.substring(6,8);
        Calendar calendar = Calendar.getInstance();

        calendar.set(Integer.parseInt(year), Integer.parseInt(month)-1,Integer.parseInt(day));
        int dayOfweek = calendar.get(Calendar.DAY_OF_WEEK);
        switch(dayOfweek) {
        case Calendar.SUNDAY: return "SUNDAY";
        case Calendar.MONDAY: return "MONDAY";
        case Calendar.TUESDAY: return "TUESDAY";
        case Calendar.WEDNESDAY: return "WEDNESDAY";
        case Calendar.THURSDAY: return "THURSDAY";
        case Calendar.FRIDAY: return "FRIDAY";
        case Calendar.SATURDAY: return "SATURDAY";
        }
        return"";
    }

    // ----- 追加:ここから -----
    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return res;
    }
    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return res;
    }
    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return res;
    }
    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return res;
    }
    // ----- 追加:ここまで -----
}

