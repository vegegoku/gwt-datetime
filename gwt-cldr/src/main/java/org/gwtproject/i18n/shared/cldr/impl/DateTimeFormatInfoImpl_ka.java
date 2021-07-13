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
 * Implementation of DateTimeFormatInfo for the "ka" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_ka extends DateTimeFormatInfoImpl {

  @Override
  public String[] ampms() {
    return new String[] {
        "AM",
        "PM"
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "EEEE, dd MMMM, y";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM, y";
  }

  @Override
  public String dateFormatMedium() {
    return "d MMM. y";
  }

  @Override
  public String dateFormatShort() {
    return "dd.MM.yy";
  }

  @Override
  public String dateTime(String timePattern, String datePattern) {
    return dateTimeMedium(timePattern, datePattern);
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + ", " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "ძველი წელთაღრიცხვით",
        "ახალი წელთაღრიცხვით"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "ძვ. წ.",
        "ახ. წ."
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
    return "h:mm a";
  }

  @Override
  public String formatHour12MinuteSecond() {
    return "h:mm:ss a";
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
    return "mm:ss";
  }

  @Override
  public String formatMonthAbbrev() {
    return "LLL";
  }

  @Override
  public String formatMonthAbbrevDay() {
    return "d MMM";
  }

  @Override
  public String formatMonthFull() {
    return "LLLL";
  }

  @Override
  public String formatMonthFullDay() {
    return "d MMMM";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "EEEE, d MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "d.M";
  }

  @Override
  public String formatYear() {
    return "y";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "MMM. y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM. y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM, y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM, y";
  }

  @Override
  public String formatYearMonthNum() {
    return "M.y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "d.M.y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, d MMM. y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "QQQQ, y";
  }

  @Override
  public String formatYearQuarterShort() {
    return "Q, y";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "იანვარი",
        "თებერვალი",
        "მარტი",
        "აპრილი",
        "მაისი",
        "ივნისი",
        "ივლისი",
        "აგვისტო",
        "სექტემბერი",
        "ოქტომბერი",
        "ნოემბერი",
        "დეკემბერი"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return monthsFull();
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "ი",
        "თ",
        "მ",
        "ა",
        "მ",
        "ი",
        "ი",
        "ა",
        "ს",
        "ო",
        "ნ",
        "დ"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "იან",
        "თებ",
        "მარ",
        "აპრ",
        "მაი",
        "ივნ",
        "ივლ",
        "აგვ",
        "სექ",
        "ოქტ",
        "ნოე",
        "დეკ"
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return monthsShort();
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "I კვარტალი",
        "II კვარტალი",
        "III კვარტალი",
        "IV კვარტალი"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "I კვ.",
        "II კვ.",
        "III კვ.",
        "IV კვ."
    };
  }

  @Override
  public String timeFormat() {
    return timeFormatMedium();
  }

  @Override
  public String timeFormatFull() {
    return "HH:mm:ss zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "HH:mm:ss z";
  }

  @Override
  public String timeFormatMedium() {
    return "HH:mm:ss";
  }

  @Override
  public String timeFormatShort() {
    return "HH:mm";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "კვირა",
        "ორშაბათი",
        "სამშაბათი",
        "ოთხშაბათი",
        "ხუთშაბათი",
        "პარასკევი",
        "შაბათი"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "კ",
        "ო",
        "ს",
        "ო",
        "ხ",
        "პ",
        "შ"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return weekdaysNarrow();
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "კვი",
        "ორშ",
        "სამ",
        "ოთხ",
        "ხუთ",
        "პარ",
        "შაბ"
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
