package cn.examen.domain.question;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Essay extends Question{

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id",getId())
                .append("courseId",getCourseId())
                .append("content",getContent())
                .append("section",getSection())
                .append("diff",getDiff())
                .append("imagepath",getImagepath())
                .toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getId())
                .append(getCourseId())
                .append(getContent())
                .append(getSection())
                .append(getDiff())
                .append(getImagepath())
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Essay == false) return false;
        if(this == obj) return true;
        Essay other = (Essay)obj;
        return new EqualsBuilder()
                .append(getId(), other.getId())
                .isEquals();
    }
}