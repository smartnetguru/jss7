/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

/**
 *
 */
package org.mobicents.protocols.ss7.tcap.asn.comp;

import org.mobicents.protocols.asn.Tag;

/**
 * @author baranowb
 * @author amit bhayani
 *
 */
public interface ReturnError extends Component {
    int _TAG = 0x03;
    boolean _TAG_PC_PRIMITIVE = false;
    int _TAG_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;

    int _TAG_IID = 0x02;
    boolean _TAG_IID_PC_PRIMITIVE = true;
    int _TAG_IID_CLASS = Tag.CLASS_UNIVERSAL;

    // mandatory
    // void setInvokeId(Long i);
    // Long getInvokeId();

    // mandatory
    // that damn error code
    void setErrorCode(ErrorCode ec);

    ErrorCode getErrorCode();

    // paramter, optional
    void setParameter(Parameter p);

    Parameter getParameter();
}
