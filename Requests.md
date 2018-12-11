# KioskApp requests:

### Description
In this document there are all the requests that the KioskApp application executes.

### Variables

```
LIQUID_TOKEN = Token used to auth the request.
LIQUID_TIMESTAMP = The date of the request Ex: 2018-12-11T19:27:30+01:00
DEVICE_ID = The device UUID Ex: c1fb554a-a5d7-4c66-b319-81a915400963
USER_ID = The UserID Ex: KKIOX6A2319A15352416EA8D23F4108DE195F
PHONE_NUMBER = The phone number Ex: +4100000000
```
***

### Get languages:

```
curl -H 'Host: kkiosk-ufeed.feeds.barcodes.no' -H 'accept: */*' -H 'content-type: application/json' -H 'x-liquid-timestamp: LIQUID_TIMESTAMP' -H 'user-agent: K-Kiosk/437 CFNetwork/975.0.3 Darwin/18.2.0' -H 'x-liquid-signature: LIQUID_TOKEN' -H 'accept-language: de-ch' --compressed 'https://kkiosk-ufeed.feeds.barcodes.no/v1/Languages?'
```

> Response:

```
{
	"Languages": {
		"de-CH": "Deutsch",
		"fr-CH": "français"
	}
}
```


### Initialize:


```
curl -H 'Host: kkiosk-ufeed.feeds.barcodes.no' -H 'accept: */*' -H 'content-type: application/json' -H 'accept-language: de-ch' -H 'x-liquid-timestamp: LIQUID_TIMESTAMP' -H 'user-agent: K-Kiosk/437 CFNetwork/975.0.3 Darwin/18.2.0' -H 'x-liquid-signature: LIQUID_TOKEN' --data-binary '{
  "Culture" : "de-CH",
  "DeviceId" : "DEVICE_ID"
}' --compressed 'https://kkiosk-ufeed.feeds.barcodes.no/v1/initialize'
```

> Response:

```
{
	"UserId": "USER_ID",
	"Consents": [{
		"Name": "Master",
		"State": "NoConsent",
		"Mandatory": true,
		"CurrentVersion": {
			"Id": 543,
			"Title": "Datenschutzerklärung",
			"Version": "0.13",
			"Description": "Long html description...",
			"MinimumAge": 0
		},
		"ChangeLog": [{
			"Id": 543,
			"Version": "0.13"
		}]
	}, {
		"Name": "Sms",
		"State": "NoConsent",
		"Mandatory": false,
		"CurrentVersion": {
			"Id": 502,
			"Title": "SMS-Mitteilungen",
			"Version": "0.6",
			"Description": "Long html description...",
			"DefaultState": false,
			"MinimumAge": 0
		},
		"ChangeLog": [{
			"Id": 502,
			"Version": "0.6"
		}]
	}, {
		"Name": "TermsOfUse",
		"State": "NoConsent",
		"Mandatory": false,
		"CurrentVersion": {
			"Id": 837,
			"Title": "Nutzungsbedingungen",
			"Version": "1.1",
			"Description": "Long html description...",
			"PrivacyPolicy": "<p>.</p>\r\n",
			"DefaultState": false,
			"MinimumAge": 0
		},
		"ChangeLog": [{
			"Id": 837,
			"Version": "1.1"
		}]
	}]
}
```


### Request pin:

```
curl -H 'Host: kkiosk-ufeed.feeds.barcodes.no' -H 'accept: */*' -H 'content-type: application/json' -H 'accept-language: de-ch' -H 'x-liquid-timestamp: LIQUID_TIMESTAMP' -H 'user-agent: K-Kiosk/437 CFNetwork/975.0.3 Darwin/18.2.0' -H 'x-liquid-signature: LIQUID_TOKEN' --data-binary '{
  "MSN" : "PHONE_NUMBER",
  "UserID" : "USER_ID"
}' --compressed 'https://kkiosk-ufeed.feeds.barcodes.no/v1/pin'
```

> Response:

```
{
	"Status": "SmsSent"
}
```

### Register pin:

```
curl -H 'Host: kkiosk-ufeed.feeds.barcodes.no' -H 'accept: */*' -H 'content-type: application/json' -H 'accept-language: de-ch' -H 'x-liquid-timestamp: LIQUID_TIMESTAMP' -H 'user-agent: K-Kiosk/437 CFNetwork/975.0.3 Darwin/18.2.0' -H 'x-liquid-signature: LIQUID_TOKEN' --data-binary '{
  "DateOfBirth" : "1980-01-01",
  "Pin" : "3480",
  "ApprovedConsents" : [
    543
  ],
  "RevokedConsents" : [

  ],
  "UserID" : "USER_ID"
}' --compressed 'https://kkiosk-ufeed.feeds.barcodes.no/v1/user'
```

> Response:

```
{
	"UserId": "USER_ID",
	"Msn": "PHONE_NUMBER", //Without +
	"DeviceId": "DEVICE_ID",
	"Emails": [],
	"DateOfBirth": "1980-01-01",
	"PreferredStores": [],
	"SelectedPreferredStores": [],
	"UserGroups": [{
		"GroupDescription": "Mitarbeiterrabatte",
		"UserConfigurable": "CodeConfigurable",
		"GroupId": "Mitarbeiterrabatte",
		"IsUserMember": false
	}, {
		"GroupDescription": "Valora",
		"UserConfigurable": "CodeConfigurable",
		"GroupId": "Valora",
		"IsUserMember": false
	}],
	"Consents": [{
		"Name": "Master",
		"State": "ConsentGiven",
		"Mandatory": true,
		"LastApproved": {
			"Id": 543,
			"Title": "Datenschutzerklärung",
			"Version": "0.13",
			"Description": "Long html description...",
			"DefaultState": false,
			"RevokeWarningText": "Long html description...",
			"MinimumAge": 0
		},
		"CurrentVersion": {
			"Id": 543,
			"Title": "Datenschutzerklärung",
			"Version": "0.13",
			"Description": "Long html description...",
			"DefaultState": false,
			"RevokeWarningText": "Long html description...",
			"MinimumAge": 0
		},
		"ChangeLog": []
	}, {
		"Name": "Sms",
		"State": "NoConsent",
		"Mandatory": false,
		"CurrentVersion": {
			"Id": 502,
			"Title": "SMS-Mitteilungen",
			"Version": "0.6",
			"Description": "Long html description...",
			"DefaultState": false,
			"MinimumAge": 0
		},
		"ChangeLog": [{
			"Id": 502,
			"Version": "0.6"
		}]
	}, {
		"Name": "TermsOfUse",
		"State": "NoConsent",
		"Mandatory": false,
		"CurrentVersion": {
			"Id": 837,
			"Title": "Nutzungsbedingungen",
			"Version": "1.1",
			"Description": "Long html description...",
			"PrivacyPolicy": "<p>.</p>\r\n",
			"DefaultState": false,
			"MinimumAge": 0
		},
		"ChangeLog": [{
			"Id": 837,
			"Version": "1.1"
		}]
	}],
	"UserMyPage": "https://liveloyalty.com/mypage?p=A_TOKEN", //User personal page to delete account,...
	"PaymentMethods": []
}
```

### Register user data:

```
curl -H 'Host: kkiosk-ufeed.feeds.barcodes.no' -H 'accept: */*' -H 'content-type: application/json' -H 'accept-language: de-ch' -H 'x-liquid-timestamp: LIQUID_TIMESTAMP' -H 'user-agent: K-Kiosk/437 CFNetwork/975.0.3 Darwin/18.2.0' -H 'x-liquid-signature: LIQUID_TOKEN' --data-binary '{
  "DateOfBirth" : "1980-12-12",
  "Culture" : "de-CH",
  "Name" : "Name Lastname",
  "Gender" : "M",
  "UserID" : "USER_ID",
  "ApprovedConsents" : [
    543
  ],
  "RevokedConsents" : [
    502,
    837
  ]
}' -X PUT --compressed 'https://kkiosk-ufeed.feeds.barcodes.no/v1/user'
```


> Response:

```
{
	"UserId": "USER_ID",
	"Msn": "PHONE_NUMBER", //Without +
	"Name": "shhdhdhdbd dbdhdhdhdh",
	"DeviceId": "DEVICE_ID",
	"Emails": [],
	"DateOfBirth": "1980-12-12",
	"Gender": "M",
	"PreferredStores": [],
	"SelectedPreferredStores": [],
	"UserGroups": [{
		"GroupDescription": "Mitarbeiterrabatte",
		"UserConfigurable": "CodeConfigurable",
		"GroupId": "Mitarbeiterrabatte",
		"IsUserMember": false
	}, {
		"GroupDescription": "Valora",
		"UserConfigurable": "CodeConfigurable",
		"GroupId": "Valora",
		"IsUserMember": false
	}],
	"Culture": "de-CH",
	"Consents": [{
		"Name": "Master",
		"State": "ConsentGiven",
		"Mandatory": true,
		"LastApproved": {
			"Id": 543,
			"Title": "Datenschutzerklärung",
			"Version": "0.13",
			"Description": "Long html description...",
			"MinimumAge": 0
		},
		"CurrentVersion": {
			"Id": 543,
			"Title": "Datenschutzerklärung",
			"Version": "0.13",
			"Description": "Long html description...",
			"DefaultState": false,
			"RevokeWarningText": "Long html description...",
			"MinimumAge": 0
		},
		"ChangeLog": []
	}, {
		"Name": "Sms",
		"State": "NoConsent",
		"Mandatory": false,
		"CurrentVersion": {
			"Id": 502,
			"Title": "SMS-Mitteilungen",
			"Version": "0.6",
			"Description": "Long html description...",
			"DefaultState": false,
			"MinimumAge": 0
		},
		"ChangeLog": [{
			"Id": 502,
			"Version": "0.6"
		}]
	}, {
		"Name": "TermsOfUse",
		"State": "NoConsent",
		"Mandatory": false,
		"CurrentVersion": {
			"Id": 837,
			"Title": "Nutzungsbedingungen",
			"Version": "1.1",
			"Description": "Long html description...",
			"PrivacyPolicy": "<p>.</p>\r\n",
			"DefaultState": false,
			"MinimumAge": 0
		},
		"ChangeLog": [{
			"Id": 837,
			"Version": "1.1"
		}]
	}],
	"UserMyPage": "https://liveloyalty.com/mypage?p=A_TOKEN", //User personal page to delete account,...
	"PaymentMethods": []
}
```


### Get user info:

```
curl -H 'Host: kkiosk-ufeed.feeds.barcodes.no' -H 'accept: */*' -H 'content-type: application/json' -H 'x-liquid-timestamp: LIQUID_TIMESTAMP' -H 'user-agent: K-Kiosk/437 CFNetwork/975.0.3 Darwin/18.2.0' -H 'x-liquid-signature: LIQUID_TOKEN' -H 'accept-language: de-ch' --compressed 'https://kkiosk-ufeed.feeds.barcodes.no/v1/content?UserID=USER_ID'
```


> Response:

```
{
	"Sections": [{
		"Id": 1,
		"Name": "Coupons",
		"Content": [{
			"ScheduleId": 81123,
			"ContentId": 306984099,
			"TopImageUrl": "https://c.barcodes.no/campaign_8bca73fe-2f02-40d8-866c-644695997ff0.jpg?v=b3fada7730c24425bdb10105f1a00750",
			"TopText": "Gültig bis 16. Dez",
			"BarcodeUrl": "https://c.barcodes.no/Codes/4faa50e19db94916b6c64cd27eb72317.png",
			"BottomText": "01 16 34 05",
			"BackUrl": "https://c.barcodes.no/schedule_143f0e34-2c27-46fb-b8e5-f0634092641a.jpg?v=f73791afa69b4b90875968915c12d196",
			"BackgroundColour": "#ffffff",
			"Type": "Coupon",
			"ExpiryDate": "2018-12-16T22:59:00.0000000+00:00",
			"ShareType": "Shareable",
			"ValidForStoreTags": [],
			"Activated": true
		}]
	}, {
		"Id": 2,
		"Name": "Loyalty",
		"Content": [{
			"ScheduleId": 47103,
			"ContentId": 306984109,
			"TopImageUrl": "https://c.barcodes.no/campaign_c5377ac0-51e2-4fb2-bc49-5fbae7ceaf49.jpg?v=1992564549be4527b5b08607299712fd",
			"TopText": "",
			"BarcodeUrl": "https://c.barcodes.no/Codes/14ede49e60db4ecd8181bfcdc8987853.png",
			"BottomText": "34 05 81 56",
			"BackUrl": "https://c.barcodes.no/schedule_ffaf2953-9070-40c2-a10e-fcfd9ba928ca.jpg?v=f8aac4ac2045441fab5ef586b243897a",
			"BackgroundColour": "#fff",
			"Type": "Coupon",
			"ExpiryDate": "2018-12-31T22:59:00.0000000+00:00",
			"ShareType": "NotShareable",
			"ValidForStoreTags": [],
			"Activated": true
		}]
	}, {
		"Id": 3,
		"Name": "Rewards",
		"Content": [{
			"ScheduleId": 81423,
			"ContentId": 306984097,
			"TopImageUrl": "https://c.barcodes.no/campaign_2da50169-83df-4200-9c77-0f05ec876697.jpg?v=90a17a0a62214303be898a129c0328ac",
			"TopText": "Gültig bis 11. Dez",
			"BarcodeUrl": "https://c.barcodes.no/Codes/77b48fa2b2934fb3b9fb8d7f537e576b.png",
			"BottomText": "22 88 12 14",
			"BackgroundColour": "#ffffff",
			"Type": "Coupon",
			"ExpiryDate": "2018-12-11T22:59:00.0000000+00:00",
			"ShareType": "Shareable",
			"ValidForStoreTags": [],
			"Activated": true
		}]
	}, {
		"Id": 4,
		"Name": "Offers",
		"Content": [{
			"ScheduleId": 81177,
			"ContentId": 306984106,
			"TopImageUrl": "https://c.barcodes.no/campaign_0b719f18-c5ba-4b3c-9f5e-72d0902bebdd.jpg?v=abdc39c7e95e4e13845d6301be4b35fc",
			"TopText": "",
			"BottomText": "",
			"BackgroundColour": "#ffffff",
			"Type": "Coupon",
			"ExpiryDate": "2018-12-16T22:59:00.0000000+00:00",
			"ShareType": "Shareable",
			"ValidForStoreTags": [],
			"Activated": true
		}]
	}]
}
```

### Example of barcodes:


https://c.barcodes.no/Codes/77b48fa2b2934fb3b9fb8d7f537e576b.png
https://c.barcodes.no/Codes/4faa50e19db94916b6c64cd27eb72317.png
https://c.barcodes.no/Codes/a5ee32637c0e4c9a8580f933c07c6120.png

***
