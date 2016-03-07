// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.versioncontrol.clientservices._03._CheckinNote;
import ms.tfs.versioncontrol.clientservices._03._CheckinNoteFieldValue;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._RepositorySoap_Shelve;
import ms.tfs.versioncontrol.clientservices._03._Shelveset;
import ms.tfs.versioncontrol.clientservices._03._VersionControlLink;

import java.lang.Object;
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
public class _RepositorySoap_Shelve
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String workspaceName;
    protected String workspaceOwner;
    protected String[] serverItems;
    protected _Shelveset shelveset;
    protected boolean replace;

    public _RepositorySoap_Shelve()
    {
        super();
    }

    public _RepositorySoap_Shelve(
        final String workspaceName,
        final String workspaceOwner,
        final String[] serverItems,
        final _Shelveset shelveset,
        final boolean replace)
    {
        // TODO : Call super() instead of setting all fields directly?
        setWorkspaceName(workspaceName);
        setWorkspaceOwner(workspaceOwner);
        setServerItems(serverItems);
        setShelveset(shelveset);
        setReplace(replace);
    }

    public String getWorkspaceName()
    {
        return this.workspaceName;
    }

    public void setWorkspaceName(String value)
    {
        this.workspaceName = value;
    }

    public String getWorkspaceOwner()
    {
        return this.workspaceOwner;
    }

    public void setWorkspaceOwner(String value)
    {
        this.workspaceOwner = value;
    }

    public String[] getServerItems()
    {
        return this.serverItems;
    }

    public void setServerItems(String[] value)
    {
        this.serverItems = value;
    }

    public _Shelveset getShelveset()
    {
        return this.shelveset;
    }

    public void setShelveset(_Shelveset value)
    {
        this.shelveset = value;
    }

    public boolean isReplace()
    {
        return this.replace;
    }

    public void setReplace(boolean value)
    {
        this.replace = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceName",
            this.workspaceName);
        XMLStreamWriterHelper.writeElement(
            writer,
            "workspaceOwner",
            this.workspaceOwner);

        if (this.serverItems != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("serverItems");

            for (int iterator0 = 0; iterator0 < this.serverItems.length; iterator0++)
            {
                XMLStreamWriterHelper.writeElement(
                    writer,
                    "string",
                    this.serverItems[iterator0]);
            }

            writer.writeEndElement();
        }

        if (this.shelveset != null)
        {
            this.shelveset.writeAsElement(
                writer,
                "shelveset");
        }

        XMLStreamWriterHelper.writeElement(
            writer,
            "replace",
            this.replace);

        writer.writeEndElement();
    }
}