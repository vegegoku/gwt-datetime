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
 * Implementation of DateTimeFormatInfo for the "os_GE" locale.
 */

import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;

public class DateTimeFormatInfoImpl_os_GE extends DateTimeFormatInfoImpl_os {

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
    return "EEEE, d MMMM, y 'аз'";
  }

  @Override
  public String dateFormatLong() {
    return "d MMMM, y 'аз'";
  }

  @Override
  public String dateFormatMedium() {
    return "dd MMM y 'аз'";
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
        "н.д.а.",
        "н.д."
    };
  }

  @Override
  public String[] erasShort() {
    return new String[] {
        "н.д.а.",
        "н.д."
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
    return "MMMM d";
  }

  @Override
  public String formatMonthFullWeekdayDay() {
    return "cccc, d MMMM";
  }

  @Override
  public String formatMonthNumDay() {
    return "dd.MM";
  }

  @Override
  public String formatYear() {
    return "y";
  }

  @Override
  public String formatYearMonthAbbrev() {
    return "LLL y";
  }

  @Override
  public String formatYearMonthAbbrevDay() {
    return "d MMM, y 'аз'";
  }

  @Override
  public String formatYearMonthFull() {
    return "y MMMM";
  }

  @Override
  public String formatYearMonthFullDay() {
    return "d MMMM, y 'аз'";
  }

  @Override
  public String formatYearMonthNum() {
    return "MM.y";
  }

  @Override
  public String formatYearMonthNumDay() {
    return "d.M.y";
  }

  @Override
  public String formatYearMonthWeekdayDay() {
    return "EEE, d MMM y";
  }

  @Override
  public String formatYearQuarterFull() {
    return "y-'ӕм' 'азы' QQQQ";
  }

  @Override
  public String formatYearQuarterShort() {
    return "y-'ӕм' 'азы' Q";
  }

  @Override
  public String[] monthsFull() {
    return new String[] {
        "январы",
        "февралы",
        "мартъийы",
        "апрелы",
        "майы",
        "июны",
        "июлы",
        "августы",
        "сентябры",
        "октябры",
        "ноябры",
        "декабры"
    };
  }

  @Override
  public String[] monthsFullStandalone() {
    return new String[] {
        "Январь",
        "Февраль",
        "Мартъи",
        "Апрель",
        "Май",
        "Июнь",
        "Июль",
        "Август",
        "Сентябрь",
        "Октябрь",
        "Ноябрь",
        "Декабрь"
    };
  }

  @Override
  public String[] monthsNarrow() {
    return new String[] {
        "Я",
        "Ф",
        "М",
        "А",
        "М",
        "И",
        "И",
        "А",
        "С",
        "О",
        "Н",
        "Д"
    };
  }

  @Override
  public String[] monthsNarrowStandalone() {
    return monthsNarrow();
  }

  @Override
  public String[] monthsShort() {
    return new String[] {
        "янв.",
        "фев.",
        "мар.",
        "апр.",
        "майы",
        "июны",
        "июлы",
        "авг.",
        "сен.",
        "окт.",
        "ноя.",
        "дек."
    };
  }

  @Override
  public String[] monthsShortStandalone() {
    return new String[] {
        "Янв.",
        "Февр.",
        "Март.",
        "Апр.",
        "Май",
        "Июнь",
        "Июль",
        "Авг.",
        "Сент.",
        "Окт.",
        "Нояб.",
        "Дек."
    };
  }

  @Override
  public String[] quartersFull() {
    return new String[] {
        "1-аг квартал",
        "2-аг квартал",
        "3-аг квартал",
        "4-ӕм квартал"
    };
  }

  @Override
  public String[] quartersShort() {
    return new String[] {
        "1-аг кв.",
        "2-аг кв.",
        "3-аг кв.",
        "4-ӕм кв."
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
        "хуыцаубон",
        "къуырисӕр",
        "дыццӕг",
        "ӕртыццӕг",
        "цыппӕрӕм",
        "майрӕмбон",
        "сабат"
    };
  }

  @Override
  public String[] weekdaysFullStandalone() {
    return new String[] {
        "Хуыцаубон",
        "Къуырисӕр",
        "Дыццӕг",
        "Ӕртыццӕг",
        "Цыппӕрӕм",
        "Майрӕмбон",
        "Сабат"
    };
  }

  @Override
  public String[] weekdaysNarrow() {
    return new String[] {
        "Х",
        "К",
        "Д",
        "Ӕ",
        "Ц",
        "М",
        "С"
    };
  }

  @Override
  public String[] weekdaysNarrowStandalone() {
    return weekdaysNarrow();
  }

  @Override
  public String[] weekdaysShort() {
    return new String[] {
        "хцб",
        "крс",
        "дцг",
        "ӕрт",
        "цпр",
        "мрб",
        "сбт"
    };
  }

  @Override
  public String[] weekdaysShortStandalone() {
    return new String[] {
        "Хцб",
        "Крс",
        "Дцг",
        "Ӕрт",
        "Цпр",
        "Мрб",
        "Сбт"
    };
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
