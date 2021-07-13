package org.gwtproject.i18n.cldr.generator.model;

import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/12/21
 */
public class MonthPatternContext {

    @XmlAttribute
    private String type;

    private List<MonthPatternWidth> monthPatternWidth;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<MonthPatternWidth> getMonthPatternWidth() {
        return monthPatternWidth;
    }

    public void setMonthPatternWidth(List<MonthPatternWidth> monthPatternWidth) {
        this.monthPatternWidth = monthPatternWidth;
    }
}
