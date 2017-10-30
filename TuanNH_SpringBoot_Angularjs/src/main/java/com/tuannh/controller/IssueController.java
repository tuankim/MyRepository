package com.tuannh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taskadapter.redmineapi.IssueManager;
import com.taskadapter.redmineapi.RedmineException;
import com.taskadapter.redmineapi.RedmineManager;
import com.taskadapter.redmineapi.RedmineManagerFactory;
import com.taskadapter.redmineapi.bean.Issue;
import com.tuannh.model.IssueBean;
import com.tuannh.service.IssueService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:4200"})
public class IssueController {

	@Autowired
	IssueService issueService;
	
	private  List<Issue> issues;

	public IssueController() {
		super();
		System.setProperty("http.proxyHost","10.225.3.1");
		System.setProperty("http.proxyPort","3128");
		String uri = "http://apis.ifisolution.local:8080";
		String projectKey = "training-project";
		Integer queryId = null; // any

		RedmineManager mgr = RedmineManagerFactory.createWithUserAuth(uri, "fresher12", "12345678");
	    IssueManager issueManager = mgr.getIssueManager();
	   
		try {
			issues = issueManager.getIssues(projectKey, queryId);
			for (Issue issue : issues) {
				System.out.println(issue.getId()+issue.getSubject()+issue.getStatusName()+issue.getTracker().getName()+issue.getAssigneeName()+issue.getUpdatedOn()+issue.getPriorityText());
//				IssueBean issueBean=new IssueBean();
//				issueBean.setId_issue(issue.getId());
//				issueBean.setTrackerName(issue.getTracker().getName());
//				issueBean.setStatusName(issue.getStatusName());
//				issueBean.setSubject(issue.getSubject());
//				issueBean.setUpdatedOn(issue.getUpdatedOn());
//				issueBean.setCategoryName(issue.getCategory().getName());
//		        issueService.save(issueBean);
		    }
		} catch (RedmineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

						// get list issue

	@RequestMapping(value = "/issue/", method = RequestMethod.GET)
	public ResponseEntity<List<IssueBean>> listAll() {
		
			for (Issue issue : issues) {
				IssueBean issueBean=new IssueBean();
				issueBean.setId_issue(issue.getId());
				issueBean.setTrackerName(issue.getTracker().getName());
				issueBean.setStatusName(issue.getStatusName());
				issueBean.setSubject(issue.getSubject());
				issueBean.setUpdatedOn(issue.getUpdatedOn());
				issueBean.setAssignee(issue.getAssigneeName());
				issueBean.setPriorityText(issue.getPriorityText());
//				issueBean.setCategoryName(iss ue.getCategory().getName());
		        issueService.save(issueBean);
		    }
		
		List<IssueBean> list = issueService.getAllIssue();
		list.forEach(x -> System.out.println(x));
		
//		if (list.i) {
//			return new ResponseEntity(HttpStatus.NO_CONTENT);
//		}
		return new ResponseEntity<List<IssueBean>>(list, HttpStatus.OK);
	}

	// // save a CardCenter
	//
	// @RequestMapping(value = "/cardcenter/", method = RequestMethod.POST)
	// public ResponseEntity<?> createTransactionData(@RequestBody CartCenters
	// cartCenter, UriComponentsBuilder ucBuilder) {
	//
	// cardCenterService.save(cartCenter);
	//
	// HttpHeaders headers = new HttpHeaders();
	// headers.setLocation(ucBuilder.path("/api/cartcenter/{id}").buildAndExpand(cartCenter.getCardCenterId()).toUri());
	// return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	// }
	//
	// // ------------------- Update a CardCenters
	// ------------------------------------------------
	//
	// @RequestMapping(value = "/cardcenter/{id}", method = RequestMethod.PUT)
	// public ResponseEntity<?> updateUser(@PathVariable("id") UUID id, @RequestBody
	// CartCenters cartCenter) {
	//
	// CartCenters card = cardCenterService.findOne(id);
	// card.setCardCenterId(cartCenter.getCardCenterId());
	// card.setCartCenterDetails(cartCenter.getCartCenterDetails());
	// card.setAmount(cartCenter.getAmount());
	// cardCenterService.save(card);
	// return new ResponseEntity<CartCenters>(card, HttpStatus.OK);
	// }
	//
	// // ------------------- Delete a
	// CardCenters-----------------------------------------
	//
	// @RequestMapping(value = "/cardcenter/{id}", method = RequestMethod.DELETE)
	// public ResponseEntity<?> deleteUser(@PathVariable("id") UUID id) {
	//
	// CartCenters card = cardCenterService.findOne(id);
	//
	// cardCenterService.deleteById(id);
	// return new ResponseEntity<CartCenters>(HttpStatus.NO_CONTENT);
	// }
	//
	// // ------------------- Delete All CardCenters-----------------------------
	//
	// @RequestMapping(value = "/cardcenter/", method = RequestMethod.DELETE)
	// public ResponseEntity<CartCenters> deleteAll() {
	//
	// cardCenterService.deleteAll();
	// return new ResponseEntity<CartCenters>(HttpStatus.NO_CONTENT);
	// }
}