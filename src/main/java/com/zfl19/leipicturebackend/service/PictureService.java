package com.zfl19.leipicturebackend.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zfl19.leipicturebackend.model.domain.Picture;
import com.zfl19.leipicturebackend.model.domain.User;
import com.zfl19.leipicturebackend.model.dto.file.PictureQueryRequest;
import com.zfl19.leipicturebackend.model.dto.picture.PictureUploadRequest;
import com.zfl19.leipicturebackend.model.vo.PictureVO;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zengf
 * @description 针对表【picture(图片)】的数据库操作Service
 */
public interface PictureService extends IService<Picture> {
    /**
     * 上传图片
     *
     * @param multipartFile
     * @param pictureUploadRequest
     * @param loginUser
     * @return
     */
    PictureVO uploadPicture(MultipartFile multipartFile,
                            PictureUploadRequest pictureUploadRequest,
                            User loginUser);

    /**
     * 查询请求转为 QueryWrapper 对象
     * @param pictureQueryRequest
     * @return
     */
    QueryWrapper<Picture> getQueryWrapper(PictureQueryRequest pictureQueryRequest);

    /**
     * 图片装换成包装类
     * @param picture
     * @param request
     * @return
     */
    PictureVO getPictureVO(Picture picture, HttpServletRequest request);

    /**
     * 分页获取图片封装
     * @param picturePage
     * @param request
     * @return
     */
    Page<PictureVO> getPictureVOPage(Page<Picture> picturePage, HttpServletRequest request);

    /**
     * 图片数据校验（用于更新和修改图片）
     * @param picture
     */
    void validPicture(Picture picture);
}
