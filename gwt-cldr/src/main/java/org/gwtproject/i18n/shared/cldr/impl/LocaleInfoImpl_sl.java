package org.gwtproject.i18n.shared.cldr.impl;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfo;
import org.gwtproject.i18n.shared.cldr.LocaleInfoImpl;
import org.gwtproject.i18n.shared.cldr.LocalizedNames;
import org.gwtproject.i18n.shared.cldr.NumberConstants;

@Generated("gwt-cldr-importer : org.gwtproject.tools.cldr.LocalesNativeNamesProcessor, CLDR version : release-34")
public class LocaleInfoImpl_sl extends LocaleInfoImpl {
  @Override
  public String getLocaleName() {
    return "sl";
  }

  @Override
  public LocalizedNames getLocalizedNames() {
    return new LocalizedNamesImpl_sl();
  }

  @Override
  public DateTimeFormatInfo getDateTimeFormatInfo() {
    return new DateTimeFormatInfoImpl_sl();
  }

  @Override
  public NumberConstants getNumberConstants() {
    return new NumberConstantsImpl_sl();
  }

  @Override
  public boolean isRTL() {
    return false;
  }
}