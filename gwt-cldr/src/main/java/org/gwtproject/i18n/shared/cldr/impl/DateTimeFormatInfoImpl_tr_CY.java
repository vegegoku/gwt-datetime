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
 * Implementation of DateTimeFormatInfo for the "tr_CY" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_tr_CY extends DateTimeFormatInfoImpl_tr {

  @Override
  public String[] ampms() {
    return new String[] {
        "ÖÖ",
        "ÖS"
    };
  }

  @Override
  public String dateFormat() {
    return dateFormatMedium();
  }

  @Override
  public String dateFormatFull() {
    return "d MMMM y EEEE";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM y";
  }

  @Override
  public String dateFormatMedium() {
    return "d MMM y";
  }

  @Override
  public String dateFormatShort() {
    return "d.MM.y";
  }

  @Override
  public String dateTime(String timePattern, String datePattern) {
    return dateTimeMedium(timePattern, datePattern);
  }

  @Override
  public String dateTimeFull(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeLong(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeMedium(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String dateTimeShort(String timePattern, String datePattern) {
    return datePattern + " " + timePattern;
  }

  @Override
  public String[] erasFull() {
    return new String[] {
        "Milattan Önce",
        "Milattan Sonra"
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "MÖ",
        "MS"
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
    return "d MMMM EEEE";
  }

  @Override
  public String formatMonthNumDay() {
    return "d/M";
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
    return "d MMM y";
  }

  @Override
  public String formatYearMonthFull() {
    return "MMMM y";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM y";
  }

  @Override
  public String formatYearMonthNum() {
    return "MM/y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "dd.MM.y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "d MMM y EEE";
  }

  @Override
  public String formatYearQuarterFull() {
    return "y QQQQ";
  }

  @Override
  public String formatYearQuarterShort() {
    return "y Q";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "Ocak",
        "Şubat",
        "Mart",
        "Nisan",
        "Mayıs",
        "Haziran",
        "Temmuz",
        "Ağustos",
        "Eylül",
        "Ekim",
        "Kasım",
        "Aralık"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return monthsFull();
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "O",
        "Ş",
        "M",
        "N",
        "M",
        "H",
        "T",
        "A",
        "E",
        "E",
        "K",
        "A"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "Oca",
        "Şub",
        "Mar",
        "Nis",
        "May",
        "Haz",
        "Tem",
        "Ağu",
        "Eyl",
        "Eki",
        "Kas",
        "Ara"
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return monthsShort();
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1. çeyrek",
        "2. çeyrek",
        "3. çeyrek",
        "4. çeyrek"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "Ç1",
        "Ç2",
        "Ç3",
        "Ç4"
    };
  }

  @Override
  public String timeFormat() {
    return timeFormatMedium();
  }

  @Override
  public String timeFormatFull() {
    return "h:mm:ss a zzzz";
  }

  @Override
  public String timeFormatLong() {
    return "h:mm:ss a z";
  }

  @Override
  public String timeFormatMedium() {
    return "h:mm:ss a";
  }

  @Override
  public String timeFormatShort() {
    return "h:mm a";
  }

  @Override
  public String[] weekdaysFull() {
    return new String[] {
        "Pazar",
        "Pazartesi",
        "Salı",
        "Çarşamba",
        "Perşembe",
        "Cuma",
        "Cumartesi"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return weekdaysFull();
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "P",
        "P",
        "S",
        "Ç",
        "P",
        "C",
        "C"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return weekdaysNarrow();
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "Paz",
        "Pzt",
        "Sal",
        "Çar",
        "Per",
        "Cum",
        "Cmt"
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
