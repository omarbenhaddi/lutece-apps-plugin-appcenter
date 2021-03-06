/*
 * Copyright (c) 2002-2019, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.appcenter.util;

import fr.paris.lutece.portal.service.i18n.I18nService;
import fr.paris.lutece.util.ReferenceItem;
import fr.paris.lutece.util.ReferenceList;
import java.util.Locale;

public class AppCenterUtils
{
    private static final String I18N_FIRST_ITEM_KEY = "appcenter.manage_demand.filter.firstItem";
    private static final String I18N_EMPTY_ITEM_KEY = "appcenter.emptyItemKey";

    /**
     * Add a first item in given reference list
     * 
     * @param refList
     * @param locale
     */
    public static void addFirstItem( ReferenceList refList, Locale locale )
    {
        ReferenceItem item = new ReferenceItem( );
        item.setCode( "-1" );
        item.setName( I18nService.getLocalizedString( I18N_FIRST_ITEM_KEY, locale ) );

        refList.add( 0, item );
    }

    /**
     * Add a first empty item item in given reference list
     * 
     * @param refList
     * @param locale
     */
    public static void addEmptyItem( ReferenceList refList, Locale locale )
    {
        ReferenceItem item = new ReferenceItem( );
        item.setCode( "" );
        item.setName( I18nService.getLocalizedString( I18N_EMPTY_ITEM_KEY, locale ) );

        refList.add( 0, item );
    }
}
