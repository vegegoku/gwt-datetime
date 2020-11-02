/*
 * Copyright 2012 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.i18n.shared.cldr.impl;
// DO NOT EDIT - GENERATED FROM CLDR AND ICU DATA

/**
 * Implementation of DateTimeFormatInfo for the "ee_GH" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_ee_GH extends DateTimeFormatInfoImpl_ee {

  @Override
  public String[] ampms() {
    return new String[] {
        "ŋdi",
        "ɣetrɔ"
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, MMMM d 'lia' y";
  }

  @Override
  public String dateFormatLong() {
    return "MMMM d 'lia' y";
  }

  @Override
  public String dateFormatMedium() {
    return "MMM d 'lia', y";
  }

  @Override
  public String dateFormatShort() {
    return "M/d/yy";
  }

  @Override
  public String dateTime(String timePattern, String datePattern) {
    return dateTimeMedium(timePattern, datePattern);
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return timePattern + " " + datePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return timePattern + " " + datePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return timePattern + " " + datePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return timePattern + " " + datePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "Hafi Yesu Va",
        "Yesu ŋɔli"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "HYV",
        "Yŋ"
    };
  }

  @Override
  public int firstDayOfTheWeek() {
    return 1;
  }

  @Override
  public String formatDay() {
    return "d";
  }

  @Override
  public String formatHour12Minute() {
    return "a 'ga' h:mm";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "a 'ga' h:mm:ss";
  }

  @Override
  public String formatHour24Minute() {
    return "HH:mm";
  }

  @Override
  public String formatHour24MinuteSecond() {
    return "HH:mm:ss";
  }

  @Override
  public String formatMinuteSecond() {
    return "'aɖabaƒoƒo' mm:ss";
  }

  @Override
  public String formatMonthAbbrev() {
    return "LLL";
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "MMM d 'lia'";
  }

  @Override
  public String formatMonthFull() {
    return "LLLL";
  }

  @Override
  public String formatMonthFullDay() {
    return "MMMM d 'lia'";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE, MMMM d 'lia'";
  }

  @Override
  public String formatMonthNumDay() {
    return "M/d";
  }

  @Override
  public String formatYear() {
    return "y";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "MMM d 'lia', y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "MMMM d 'lia' y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M/y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "M/d/y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, MMM d, y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ y";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "dzove",
        "dzodze",
        "tedoxe",
        "afɔfĩe",
        "dama",
        "masa",
        "siamlɔm",
        "deasiamime",
        "anyɔnyɔ",
        "kele",
        "adeɛmekpɔxe",
        "dzome"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return monthsFull();
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "d",
        "d",
        "t",
        "a",
        "d",
        "m",
        "s",
        "d",
        "a",
        "k",
        "a",
        "d"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "dzv",
        "dzd",
        "ted",
        "afɔ",
        "dam",
        "mas",
        "sia",
        "dea",
        "any",
        "kel",
        "ade",
        "dzm"
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return monthsShort();
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "kɔta gbãtɔ",
        "kɔta evelia",
        "kɔta etɔ̃lia",
        "kɔta enelia"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "k1",
        "k2",
        "k3",
        "k4"
    };
  }

  @Override
  public String timeFormat() {
    return timeFormatMedium();
  }

  @Override
  public String timeFormatFull() {
    return "a 'ga' h:mm:ss zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "a 'ga' h:mm:ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "a 'ga' h:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "a 'ga' h:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "kɔsiɖa",
        "dzoɖa",
        "blaɖa",
        "kuɖa",
        "yawoɖa",
        "fiɖa",
        "memleɖa"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "k",
        "d",
        "b",
        "k",
        "y",
        "f",
        "m"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return weekdaysNarrow();
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "kɔs",
        "dzo",
        "bla",
        "kuɖ",
        "yaw",
        "fiɖ",
        "mem"
    };
  }

  @Override
  public String[] weekdaysShortStandalone() {
    return weekdaysShort();
  }

  @Override
  public int weekendEnd() {
    return 0;
  }

  @Override
  public int weekendStart() {
    return 6;
  }
}
