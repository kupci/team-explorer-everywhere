// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.build.buildservice._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.build.buildservice._03._BuildDetail;
import ms.tfs.build.buildservice._03._BuildInformationNode;
import ms.tfs.build.buildservice._03._BuildPhaseStatus;
import ms.tfs.build.buildservice._03._BuildReason;
import ms.tfs.build.buildservice._03._BuildServiceSoap_UpdateQueuedBuildsResponse;
import ms.tfs.build.buildservice._03._BuildStatus;
import ms.tfs.build.buildservice._03._GetOption;
import ms.tfs.build.buildservice._03._InformationField;
import ms.tfs.build.buildservice._03._QueuePriority;
import ms.tfs.build.buildservice._03._QueueStatus;
import ms.tfs.build.buildservice._03._QueuedBuild2008;

import java.lang.String;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _BuildServiceSoap_UpdateQueuedBuildsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _QueuedBuild2008[] updateQueuedBuildsResult;

    public _BuildServiceSoap_UpdateQueuedBuildsResponse()
    {
        super();
    }

    public _BuildServiceSoap_UpdateQueuedBuildsResponse(final _QueuedBuild2008[] updateQueuedBuildsResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setUpdateQueuedBuildsResult(updateQueuedBuildsResult);
    }

    public _QueuedBuild2008[] getUpdateQueuedBuildsResult()
    {
        return this.updateQueuedBuildsResult;
    }

    public void setUpdateQueuedBuildsResult(_QueuedBuild2008[] value)
    {
        this.updateQueuedBuildsResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("UpdateQueuedBuildsResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _QueuedBuild2008 complexObject0 = new _QueuedBuild2008();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.updateQueuedBuildsResult = (_QueuedBuild2008[]) list0.toArray(
                            new _QueuedBuild2008[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
