/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a scaling policy.
 * </p>
 */
public class ScalingPolicy implements Serializable, Cloneable {

    /**
     * The name of the Auto Scaling group associated with this scaling
     * policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * The name of the scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String policyName;

    /**
     * The Amazon Resource Name (ARN) of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String policyARN;

    /**
     * Changes the <code>DesiredCapacity</code> of the Auto Scaling group by
     * at least the specified number of instances.
     */
    private Integer minAdjustmentStep;

    /**
     * Specifies whether the <code>ScalingAdjustment</code> is an absolute
     * number or a percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String adjustmentType;

    /**
     * The number associated with the specified adjustment type. A positive
     * value adds to the current capacity and a negative value removes from
     * the current capacity.
     */
    private Integer scalingAdjustment;

    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     */
    private Integer cooldown;

    /**
     * The CloudWatch alarms related to the policy.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Alarm> alarms;

    /**
     * The name of the Auto Scaling group associated with this scaling
     * policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the Auto Scaling group associated with this scaling
     *         policy.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group associated with this scaling
     * policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group associated with this scaling
     *         policy.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the Auto Scaling group associated with this scaling
     * policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the Auto Scaling group associated with this scaling
     *         policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingPolicy withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * The name of the scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the scaling policy.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the scaling policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name of the scaling policy.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the scaling policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyName The name of the scaling policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The Amazon Resource Name (ARN) of the policy.
     */
    public String getPolicyARN() {
        return policyARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the policy.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyARN The Amazon Resource Name (ARN) of the policy.
     */
    public void setPolicyARN(String policyARN) {
        this.policyARN = policyARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param policyARN The Amazon Resource Name (ARN) of the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingPolicy withPolicyARN(String policyARN) {
        this.policyARN = policyARN;
        return this;
    }

    /**
     * Changes the <code>DesiredCapacity</code> of the Auto Scaling group by
     * at least the specified number of instances.
     *
     * @return Changes the <code>DesiredCapacity</code> of the Auto Scaling group by
     *         at least the specified number of instances.
     */
    public Integer getMinAdjustmentStep() {
        return minAdjustmentStep;
    }
    
    /**
     * Changes the <code>DesiredCapacity</code> of the Auto Scaling group by
     * at least the specified number of instances.
     *
     * @param minAdjustmentStep Changes the <code>DesiredCapacity</code> of the Auto Scaling group by
     *         at least the specified number of instances.
     */
    public void setMinAdjustmentStep(Integer minAdjustmentStep) {
        this.minAdjustmentStep = minAdjustmentStep;
    }
    
    /**
     * Changes the <code>DesiredCapacity</code> of the Auto Scaling group by
     * at least the specified number of instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minAdjustmentStep Changes the <code>DesiredCapacity</code> of the Auto Scaling group by
     *         at least the specified number of instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingPolicy withMinAdjustmentStep(Integer minAdjustmentStep) {
        this.minAdjustmentStep = minAdjustmentStep;
        return this;
    }

    /**
     * Specifies whether the <code>ScalingAdjustment</code> is an absolute
     * number or a percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return Specifies whether the <code>ScalingAdjustment</code> is an absolute
     *         number or a percentage of the current capacity. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     */
    public String getAdjustmentType() {
        return adjustmentType;
    }
    
    /**
     * Specifies whether the <code>ScalingAdjustment</code> is an absolute
     * number or a percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param adjustmentType Specifies whether the <code>ScalingAdjustment</code> is an absolute
     *         number or a percentage of the current capacity. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     */
    public void setAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
    }
    
    /**
     * Specifies whether the <code>ScalingAdjustment</code> is an absolute
     * number or a percentage of the current capacity. Valid values are
     * <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     * <code>PercentChangeInCapacity</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param adjustmentType Specifies whether the <code>ScalingAdjustment</code> is an absolute
     *         number or a percentage of the current capacity. Valid values are
     *         <code>ChangeInCapacity</code>, <code>ExactCapacity</code>, and
     *         <code>PercentChangeInCapacity</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingPolicy withAdjustmentType(String adjustmentType) {
        this.adjustmentType = adjustmentType;
        return this;
    }

    /**
     * The number associated with the specified adjustment type. A positive
     * value adds to the current capacity and a negative value removes from
     * the current capacity.
     *
     * @return The number associated with the specified adjustment type. A positive
     *         value adds to the current capacity and a negative value removes from
     *         the current capacity.
     */
    public Integer getScalingAdjustment() {
        return scalingAdjustment;
    }
    
    /**
     * The number associated with the specified adjustment type. A positive
     * value adds to the current capacity and a negative value removes from
     * the current capacity.
     *
     * @param scalingAdjustment The number associated with the specified adjustment type. A positive
     *         value adds to the current capacity and a negative value removes from
     *         the current capacity.
     */
    public void setScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
    }
    
    /**
     * The number associated with the specified adjustment type. A positive
     * value adds to the current capacity and a negative value removes from
     * the current capacity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scalingAdjustment The number associated with the specified adjustment type. A positive
     *         value adds to the current capacity and a negative value removes from
     *         the current capacity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingPolicy withScalingAdjustment(Integer scalingAdjustment) {
        this.scalingAdjustment = scalingAdjustment;
        return this;
    }

    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     *
     * @return The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     */
    public Integer getCooldown() {
        return cooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     *
     * @param cooldown The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     */
    public void setCooldown(Integer cooldown) {
        this.cooldown = cooldown;
    }
    
    /**
     * The amount of time, in seconds, after a scaling activity completes
     * before any further trigger-related scaling activities can start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cooldown The amount of time, in seconds, after a scaling activity completes
     *         before any further trigger-related scaling activities can start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingPolicy withCooldown(Integer cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * The CloudWatch alarms related to the policy.
     *
     * @return The CloudWatch alarms related to the policy.
     */
    public java.util.List<Alarm> getAlarms() {
        if (alarms == null) {
              alarms = new com.amazonaws.internal.ListWithAutoConstructFlag<Alarm>();
              alarms.setAutoConstruct(true);
        }
        return alarms;
    }
    
    /**
     * The CloudWatch alarms related to the policy.
     *
     * @param alarms The CloudWatch alarms related to the policy.
     */
    public void setAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Alarm> alarmsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Alarm>(alarms.size());
        alarmsCopy.addAll(alarms);
        this.alarms = alarmsCopy;
    }
    
    /**
     * The CloudWatch alarms related to the policy.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAlarms(java.util.Collection)} or {@link
     * #withAlarms(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alarms The CloudWatch alarms related to the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingPolicy withAlarms(Alarm... alarms) {
        if (getAlarms() == null) setAlarms(new java.util.ArrayList<Alarm>(alarms.length));
        for (Alarm value : alarms) {
            getAlarms().add(value);
        }
        return this;
    }
    
    /**
     * The CloudWatch alarms related to the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param alarms The CloudWatch alarms related to the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingPolicy withAlarms(java.util.Collection<Alarm> alarms) {
        if (alarms == null) {
            this.alarms = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Alarm> alarmsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Alarm>(alarms.size());
            alarmsCopy.addAll(alarms);
            this.alarms = alarmsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyARN() != null) sb.append("PolicyARN: " + getPolicyARN() + ",");
        if (getMinAdjustmentStep() != null) sb.append("MinAdjustmentStep: " + getMinAdjustmentStep() + ",");
        if (getAdjustmentType() != null) sb.append("AdjustmentType: " + getAdjustmentType() + ",");
        if (getScalingAdjustment() != null) sb.append("ScalingAdjustment: " + getScalingAdjustment() + ",");
        if (getCooldown() != null) sb.append("Cooldown: " + getCooldown() + ",");
        if (getAlarms() != null) sb.append("Alarms: " + getAlarms() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyARN() == null) ? 0 : getPolicyARN().hashCode()); 
        hashCode = prime * hashCode + ((getMinAdjustmentStep() == null) ? 0 : getMinAdjustmentStep().hashCode()); 
        hashCode = prime * hashCode + ((getAdjustmentType() == null) ? 0 : getAdjustmentType().hashCode()); 
        hashCode = prime * hashCode + ((getScalingAdjustment() == null) ? 0 : getScalingAdjustment().hashCode()); 
        hashCode = prime * hashCode + ((getCooldown() == null) ? 0 : getCooldown().hashCode()); 
        hashCode = prime * hashCode + ((getAlarms() == null) ? 0 : getAlarms().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScalingPolicy == false) return false;
        ScalingPolicy other = (ScalingPolicy)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicyARN() == null ^ this.getPolicyARN() == null) return false;
        if (other.getPolicyARN() != null && other.getPolicyARN().equals(this.getPolicyARN()) == false) return false; 
        if (other.getMinAdjustmentStep() == null ^ this.getMinAdjustmentStep() == null) return false;
        if (other.getMinAdjustmentStep() != null && other.getMinAdjustmentStep().equals(this.getMinAdjustmentStep()) == false) return false; 
        if (other.getAdjustmentType() == null ^ this.getAdjustmentType() == null) return false;
        if (other.getAdjustmentType() != null && other.getAdjustmentType().equals(this.getAdjustmentType()) == false) return false; 
        if (other.getScalingAdjustment() == null ^ this.getScalingAdjustment() == null) return false;
        if (other.getScalingAdjustment() != null && other.getScalingAdjustment().equals(this.getScalingAdjustment()) == false) return false; 
        if (other.getCooldown() == null ^ this.getCooldown() == null) return false;
        if (other.getCooldown() != null && other.getCooldown().equals(this.getCooldown()) == false) return false; 
        if (other.getAlarms() == null ^ this.getAlarms() == null) return false;
        if (other.getAlarms() != null && other.getAlarms().equals(this.getAlarms()) == false) return false; 
        return true;
    }
    
    @Override
    public ScalingPolicy clone() {
        try {
            return (ScalingPolicy) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    