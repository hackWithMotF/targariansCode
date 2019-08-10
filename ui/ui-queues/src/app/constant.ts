import { Injectable } from '@angular/core';

@Injectable()
export class Constants {

    constructor() {
    }

    static BASE_URL: string;
    static CURRENT_ROLES: string;

    // Load Message API
    static readonly MESSAGE_API: string = '/api/queue';
    ;

    static setBaseUrl(url: string): void {
        Constants.BASE_URL = url;
    }

    static getBaseUrl(): string {
        return Constants.BASE_URL;
    }


    

}
