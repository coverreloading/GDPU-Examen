package cn.examen.domain.course;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class College {
    private String collId;
    private String collName;

    public String getCollId() {
        return collId;
    }

    public void setCollId(String collId) {
        this.collId = collId == null ? null : collId.trim();
    }

    public String getCollName() {
        return collName;
    }

    public void setCollName(String collName) {
        this.collName = collName == null ? null : collName.trim();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("collId",getCollId())
                .append("collName",getCollName())
                .toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(getCollId())
                .append(getCollName())
                .toHashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof College == false) return false;
        if(this == obj) return true;
        College other = (College)obj;

        boolean b1 = new EqualsBuilder().append(getCollId(), other.getCollId()).isEquals();
        boolean b2 = new EqualsBuilder().append(getCollName(), other.getCollName()).isEquals();
        return b1 || b2;
    }
}