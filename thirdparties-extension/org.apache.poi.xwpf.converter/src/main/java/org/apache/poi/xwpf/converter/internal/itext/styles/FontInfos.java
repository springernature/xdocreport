/**
 * Copyright (C) 2011 Angelo Zerr <angelo.zerr@gmail.com> and Pascal Leclercq <pascal.leclercq@gmail.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.apache.poi.xwpf.converter.internal.itext.styles;

import java.awt.Color;

import org.apache.poi.xwpf.converter.itext.PDFViaITextOptions;

import com.lowagie.text.Font;

public class FontInfos
{
    private String fontFamily = "Arial";

    private float fontSize = 8;

    private int fontStyle = Font.NORMAL;

    private Color fontColor = Color.BLACK;

    private String fontEncoding = PDFViaITextOptions.create().getFontEncoding();

    public String getFontFamily()
    {
        return fontFamily;
    }

    public void setFontFamily( String fontFamily )
    {
        this.fontFamily = fontFamily;
    }

    public float getFontSize()
    {
        return fontSize;
    }

    public void setFontSize( float fontSize )
    {
        this.fontSize = fontSize;
    }

    public int getFontStyle()
    {
        return fontStyle;
    }

    public void setFontStyle( int fontStyle )
    {
        this.fontStyle = fontStyle;
    }

    public Color getFontColor()
    {
        return fontColor;
    }

    public void setFontColor( Color fontColor )
    {
        this.fontColor = fontColor;
    }

    public String getFontEncoding()
    {
        return fontEncoding;
    }

    public void setFontEncoding( String fontEncoding )
    {
        this.fontEncoding = fontEncoding;
    }
}
